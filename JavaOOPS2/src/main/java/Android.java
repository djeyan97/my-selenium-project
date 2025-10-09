public class Android extends Samsung{
    public static void main(String[] args) {
        Android android = new Android();
        android.setPlayStore("All Apps Available only on PlayStore");
        System.out.println(android.getPlayStore());
        android.setAndroidVersion("Android Version 6.0.9");
        System.out.println(android.getAndroidVersion());
        android.setModelName("Samsung S24 Ultra");
        System.out.println(android.getModelName());
    }
}
