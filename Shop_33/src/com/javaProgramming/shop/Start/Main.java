package com.javaProgramming.shop.Start;

import com.javaProgramming.shop.SalesRoom;
import com.javaProgramming.shop.service.Consultant;
import com.javaProgramming.shop.client.CommonVisitor;
import com.javaProgramming.shop.department.ElectronicDepartment;
import com.javaProgramming.shop.department.GameDepartment;
import com.javaProgramming.shop.enums.ConsultResult;
import com.javaProgramming.shop.goods.Computer;
import com.javaProgramming.shop.goods.GameConsole;
import com.javaProgramming.shop.goods.Televisor;
import com.javaProgramming.shop.service.Administrator;

public class Main {

    public static void main(String[] args) {
        imitateShopWorking();
    }

    private static void imitateShopWorking() {

        SalesRoom salesRoom = new SalesRoom();// створення торгового залу

        // створення адміністратора
        Administrator administrator = new Administrator(salesRoom);

        // створення 2х відділів
        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        GameDepartment gameDepartment = new GameDepartment();

        // добавляєм відділи в торг. зал
        salesRoom.addDepartment(electronicDepartment);
        salesRoom.addDepartment(gameDepartment);

        // добавляєм персонал в відділи
        Consultant consultant1 = new Consultant("Джон");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Анна");

        electronicDepartment.addEmployee(consultant1);
        electronicDepartment.addEmployee(consultant2);

        // створюємо товари
        Computer computer = new Computer(200, true, "Zenbook", "Asus", 2048);
        Televisor televisor = new Televisor(1000, false, "SmartTV", "Samsung");
        GameConsole xbox = new GameConsole("XBOX", 1024);

        // добавляєм товари
        electronicDepartment.addGoods(televisor);
        electronicDepartment.addGoods(computer);
        gameDepartment.addGoods(xbox);

        // створюємо відвідувачів
        CommonVisitor visitor1 = new CommonVisitor("Джон");




        // пошук консультанта
        ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(visitor1);

        switch (consultResult) {
            case BUY:
                visitor1.buy(televisor);
                break;
            case EXIT:
                break;
        }


    }
}
