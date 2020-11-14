# Java3
Java第四次实验
## 实验目的
掌握Java中抽象类和抽象方法的定义；
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理
## 实验过程
创建学生管理接口StuMan和教师管理接口TeaMan，设定学费和薪水的参数(xuefei)(xinshui)
在学生接口中设置返回值缴学费对应参数xuefei，教师接口中设置返回值发工资，在学生接口中设立返回值查学费，在教师接口中设立返回值查工资
设立博士研究生类Stu，构造姓名、性别、年龄，构造学费参数返回xuefei，构造薪水参数返回xinshui，构造返回类型缴学费参数对应xuefei，构造返回类型查学费
创建测试类test，创建输入文本，根据薪水和国家最新工资纳税标准制定应缴学费，最后输出
## 核心方法
public interface StuMan {
    void jiaoxuefei(int xuefei);
    void chaxuefei();

}

public interface TeaMan {

    void fagongzi();

    void chagongzi();

}

    if (chazhi <= 0) {
            System.out.println("应缴纳税为：" + 0);
        } else if (chazhi>0 && chazhi < 1500) {
            System.out.println("应缴纳税为：" + chazhi * s1);
        } else if (chazhi > 1500 && chazhi < 4500) {
            System.out.println("应缴纳税为：" + chazhi * s2);
        } else if (chazhi > 4500 && chazhi < 9500) {
            System.out.println("应缴纳税为：" + chazhi * s3);
        } else if (chazhi > 9500 && chazhi < 35000) {
            System.out.println("应缴纳税为：" + chazhi * s4);
        } else if (chazhi > 35000 && chazhi < 55000) {
            System.out.println("应缴纳税为：" + chazhi * s5);
        } else if (chazhi > 55000 && chazhi < 80000) {
            System.out.println("应缴纳税为：" + chazhi * s6);
        } else if (chazhi > 80000) {
            System.out.println("应缴纳税为：" + chazhi * s7);
        }

## 实验结果
请输入第一个研究生的收入：10000
请输入第一个研究生的学费：1000
应缴纳税为：400.0
请输入第二个研究生的收入：5000
请输入第二个研究生的学费：1000
应缴纳税为：0

## 实验感想
本次实验难度对于我而言稍微有些难度；通过这次实验，我学会了接口的使用方法并进行了实验操作，实验过程中遇到不少困难，包括不会创建接口、对应参数的设置等问题，在编辑test类时使用static final遇到了困难。最后通过网上搜索资料、咨询同学等方式完成了这次实验。
