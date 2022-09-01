package com.qiao.ooptest.demo37.ui;

//每个客户的信息被保存Customer对象中
//以一个Customer类型的数组来记录当前所有的客户
//每次"添加客户"(菜单1)后，客户(Customer)对象被添加到数组中
//每次"修改客户"(菜单2)后，修改后的客户(Customer)对象替换数组中原对象
//每次"删除客户"(菜单3)后，客户(customer)对象被从数组中清除
//执行"客户列表"(菜单4)后，将列出数组中所有客户的信息

import com.qiao.ooptest.demo37.bean.Customer;
import com.qiao.ooptest.demo37.service.CustomerList;
import com.qiao.ooptest.demo37.util.CMUtility;

/**
 * @ClassName CustomerView
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/8/30 10:14 PM
 * @Version 1.0
 **/
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);
    public CustomerView(){
        Customer customer = new Customer("张三",'男',30,"010-56253825",
                "abc@email.com");
        customerList.addCustomer(customer);

    }
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }


    /**
     *
     * @Description 显示菜单
     * @Author liuyuqiao
     * @Date 2022/8/31 3:16 AM
     * @Param []
     * @return void
     * @Version v1.0
     **/

    public void enterMainMenu(){
        boolean loopFlag =  true;
        do {
            System.out
                    .println("\n------------------客户信息管理系统------------------\n");
            System.out.println("                    1.添加用户");
            System.out.println("                    2.修改用户");
            System.out.println("                    3.删除用户");
            System.out.println("                    4.用户列表");
            System.out.println("                    5.退   出\n");
            System.out.print("                    请选择(1-5):");
            char key = CMUtility.readMeanSelection();
            System.out.println();
            switch (key){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    //System.out.println("退出");
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        //System.exit(0);
                        loopFlag = false;
                    }else {
                        continue;
                    }
                default:
                    System.exit(0);

            }
        }while (loopFlag);
    }
    /**
     *
     * @Description //添加客户操作
     * @Author liuyuqiao
     * @Date 2022/8/31 3:15 AM
     * @Param []
     * @return void
     * @Version v1.0
     **/

    private void addNewCustomer(){
        //System.out.println("添加用户的操作");
        System.out
                .println("\n------------------添加客户------------------\n");
        System.out.println("姓名：");
        String name = CMUtility.readString(10);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(13);
        System.out.println("邮箱：");
        String email = CMUtility.readString(30);

        //将上述数据封装到对象中
        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSucccess = customerList.addCustomer(customer);
        if (isSucccess) {
            System.out
                    .println("\n------------------添加成功------------------\n");
        }else {
            System.out
                    .println("\n------------------添加失败------------------\n");
        }

    }
    /**
     *
     * @Description 修改用户操作
     * @Author liuyuqiao
     * @Date 2022/8/31 3:15 AM
     * @Param []
     * @return void
     * @Version v1.0
     **/

    private void modifyCustomer(){
        //System.out.println("添加用户的操作");
        System.out
                .println("\n-------------------修改用户------------------\n");
        Customer customer;
        int num;
        while(true){
            System.out.print("请选择待修改的客户编号(-1)退出：");
            num = CMUtility.readInt();
            if (num == -1){
                return;
            }
            customer = customerList.getCustomer(num - 1);
            if (customer == null){
                System.out.println("无法找到指定客户");
            }else {
                //找到相应的客户
                break;
            }
        }
        //修改用户信息
        System.out.println("姓名（" + customer.getName() + "):");
        String name =  CMUtility.readString(10,customer.getName());

        System.out.println("性别（" + customer.getGender() + "):");
        char gender = CMUtility.readChar(customer.getGender());

        System.out.println("年龄（" + customer.getAge() + "):");
        int age = CMUtility.readInt(customer.getAge());

        System.out.println("电话（" + customer.getPhone() + "):");
        String phone = CMUtility.readString(13,customer.getPhone());

        System.out.println("邮箱（" + customer.getEmail() + "):");
        String email = CMUtility.readString(30,customer.getEmail());

        Customer newCustomer = new Customer(name,gender,age,phone,email);

        boolean isReplaced = customerList.replaceCustomer(num - 1,newCustomer);
        if (isReplaced){
            System.out
                    .println("\n-------------------修改完成------------------\n");
        }else {
            System.out
                    .println("\n-------------------修改失败------------------\n");
        }
    }
    /**
     *
     * @Description 删除用户操作
     * @Author liuyuqiao
     * @Date 2022/8/31 3:15 AM
     * @Param []
     * @return void
     * @Version v1.0
     **/

    private void deleteCustomer(){
        //System.out.println("添加用户的操作");
        System.out
                .println("\n-------------------删除客户------------------\n");
        int num;
        while (true){
            System.out.println("请选择待删除的客户编号(-1退出)：");
            num = CMUtility.readInt();
            if (num == -1){
                return;
            }
            Customer customer = customerList.getCustomer(num - 1);
            if (customer == null){
                System.out.println("无法找到用户");
            }else {
                break;
            }
        }
        System.out.println("是否要确认删除(Y/N)：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y'){
            boolean deleteSuccess = customerList.deleteCustomer(num - 1);
            if (deleteSuccess){
                System.out
                        .println("\n-------------------删除成功------------------\n");
            }
        }else {
            return;
        }
    }
    /**
     *
     * @Description //显示客户列表操作
     * @Author liuyuqiao
     * @Date 2022/8/31 3:16 AM
     * @Param []
     * @return void
     * @Version v1.0
     **/

    private void listAllCustomer(){
        //System.out.println("添加用户的操作");
        System.out
                .println("\n------------------客户列表------------------\n");
        int total = customerList.getTotal();
        if (total == 0){
            System.out.println("没有客户记录");
        }else {
            System.out.println("编号" + "\t\t" + "姓名" + "\t\t" + "性别" + "\t\t" + "年龄" + "\t\t" + "电话" + "\t\t\t\t" + "邮箱");
            Customer[] customers = customerList.getAllCustomers();
            for (int i = 0; i < customers.length; i++) {
                System.out.println((i + 1) + "\t\t" + customers[i].getName() + "\t\t" + customers[i].getGender() + "\t\t" + customers[i].getAge() + "\t\t" + customers[i].getPhone() + "\t" + customers[i].getEmail());
            }
        }
        System.out
                .println("\n------------------客户列表完成------------------\n");
    }

}
