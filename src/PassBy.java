public class PassBy {
    public String str;

    public PassBy(String str) {
        this.str = str;
    }
    private void changeString(String str){
        str = "123";
    }
    private void changeObject(PassBy obj){
        PassBy newObject = new PassBy("12345");
        obj = newObject;
    }
    private void changeObjectViaNew(PassBy obj){
        PassBy newObject = new PassBy("12345");
        obj = newObject;
    }
    private  void changeString(StringBuilder sb){
        sb.delete(0,6).append("1234567");
    }
    public String getStr(){
        return str;
    }
    public static void main(String[] args){
        String str = new String("1");
        PassBy passBy = new PassBy("12");
        passBy.changeString(str);
        System.out.println(str);
        passBy.changeObject(passBy);
        System.out.println(passBy.getStr());
        passBy.changeObjectViaNew(passBy);
        System.out.println(passBy.getStr());
        StringBuilder sb = new StringBuilder("123456");
        passBy.changeString(sb);
        System.out.println(sb);
    }
}
