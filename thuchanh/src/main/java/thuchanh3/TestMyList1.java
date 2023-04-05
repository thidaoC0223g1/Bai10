package thuchanh3;


public class TestMyList1 {
    public static void main(String[] args) {
        MyList1<String> str = new MyList1<>();
        str.add("tien");
        str.add("hung");
        str.add("trung");
        str.add("giang");


        str.add(4, "nam");
        str.add(5, "van");
        str.addB(6, "son");
        System.out.println(str);
        System.out.println(str.size());

        str.remove(2);
        System.out.println(str);
        System.out.println(str.size());
        System.out.println(str.get(1));
        MyList1<String> str2 =  str.clone();
        System.out.println(str2);
        System.out.println(str2.contains("linh"));
        str2.clear();
        System.out.println(str2);

    }
}
