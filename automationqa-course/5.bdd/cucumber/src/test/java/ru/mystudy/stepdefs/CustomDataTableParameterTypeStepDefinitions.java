package ru.mystudy.stepdefs;

import cucumber.api.java.ru.��������;
import ru.mystudy.pojo.User;

import java.util.List;

public class CustomDataTableParameterTypeStepDefinitions {
    @��������("� ��� ���� ������������")
    public void �_���_����_������������(List<User> users) {
        System.out.println(users);
    }
}
