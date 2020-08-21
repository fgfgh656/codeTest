import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: codeJunitTest
 * @Description:
 * @version: v1.0.0
 * @author: rishunXu
 * @date: 2020/8/21 9:22
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/8/21     rishunXu           v1.0.0               修改原因
 */
@RunWith(Parameterized.class)
public class codeJunitTest {
     String except;  //用来存储预期结果
     int[] input;  //用来存储第一个输入参数

     @Parameterized.Parameters
     public static Collection<Object[]> initTestData(){
             return Arrays.asList(
                         new Object[][]{
                         {"请输入正确数字数组信息",new int[]{}},
                         {"数字数组组合在两位，请重新输入",new int[]{1,0,0}},
                         {"数组元素只能是0到9",new int[]{100}},
                         {"AD AE AF BD BE BF CD CE CF",new int[]{2,3}}}
                 );
     }

     public codeJunitTest(String except,int[] input){
         this.except = except;
         this.input = input;
     }


     @Test
     public void unitTest(){
         assertEquals(except,Code.getNumPresentSet(input));
     }
}
