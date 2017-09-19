c class People
{
    float hight,weight; 
    String head,ear,mouth;
    void speak(String s)
    { 
       System.out.println(s);
    }
}
class A
{ 
    public static void main(String args[])
    {
      People zhubajie;
      zhubajie=new People();
      zhubajie.weight=200f;    
      zhubajie.hight=1.70F;
      zhubajie.head="大头";
      zhubajie.ear="两只大耳朵";
      zhubajie.mouth="一只大嘴";
      System.out.println("重量"+zhubajie.weight+"身高" +zhubajie.hight);
      System.out.println(zhubajie.head+zhubajie.mouth+zhubajie.ear);
      zhubajie.speak("师傅，咱们别去西天了，改去月宫吧");
    }
}
