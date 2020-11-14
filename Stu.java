public class Stu implements StuMan {

    private String name;
    private String sex;
    private String age;
    private int xuefei;
    private int xinshui;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getXuefei() {
        return xuefei;
    }

    public void setXuefei(int xuefei) {
        this.xuefei = xuefei;
    }

    public int getXinshui() {
        return xinshui;
    }

    public void setXinshui(int xinshui) {
        this.xinshui = xinshui;
    }


    @Override
    public void jiaoxuefei(int xuefei) {
        this.xuefei = xuefei;
    }

    @Override
    public void chaxuefei() {
        System.out.println("学费是" + this.xuefei);
    }
}
