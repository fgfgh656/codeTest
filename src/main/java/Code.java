import java.util.HashMap;
import java.util.Scanner;

/**
 * Copyright: Copyright (c) 2020
 *
 * @ClassName: Code
 * @Description: 数字字母映射组合
 * @version: v1.0.0
 * @author: rishunXu
 * @date: 2020/8/20 21:37
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/8/20     rishunXu           v1.0.0               修改原因
 */
public class Code {

    private static HashMap<String,String[]> numPresentMap = new HashMap<String, String[]>();

    /**
     * 初始化数字与字符对应map
     */
    static{
        numPresentMap.put("0",new String[]{""});
        numPresentMap.put("1",new String[]{""});
        numPresentMap.put("2",new String[]{"A","B","C"});
        numPresentMap.put("3",new String[]{"D","E","F"});
        numPresentMap.put("4",new String[]{"G","H","I"});
        numPresentMap.put("5",new String[]{"J","K","L"});
        numPresentMap.put("6",new String[]{"M","N","O"});
        numPresentMap.put("7",new String[]{"P","Q","R","S"});
        numPresentMap.put("8",new String[]{"T","U","V"});
        numPresentMap.put("9",new String[]{"W","X","Y","Z"});
        numPresentMap.put("*",new String[]{""});
        numPresentMap.put("#",new String[]{""});
    }

    /**
     * 根据数组参数，获取对应字符集合
     */
    public  static String getNumPresentSet(int[] numArray){
        if(numArray == null || numArray.length == 0){
            return "请输入正确数字数组信息";
        }
        if(numArray.length > 2) return "数字数组组合在两位，请重新输入";
        for(int numIndex : numArray){
            if(numIndex > 10) return "数组元素只能是0到9";
        }
        String result = "";
        if(numArray.length == 1) {
            String[] numPresent = numPresentMap.get(numArray[0]+"");
            for (String index : numPresent) {
                result = result + index;
            }
        }
        if(numArray.length == 2) {
            String[] numPresent = numPresentMap.get(numArray[0]+"");
            String[] numPresent2 = numPresentMap.get(numArray[1]+"");
            int indexNum = 0;
            for (String present : numPresent) {
                int indexNum2 = 0;
                for (String present2 : numPresent2) {
                    result = result + present + present2;
                    indexNum2++;
                    if(indexNum2 != numPresent2.length){
                        result = result + " ";
                    }

                }
                indexNum++;
                if(indexNum != numPresent2.length){
                    result = result + " ";
                }
            }
        }
        return result;
    }
}
