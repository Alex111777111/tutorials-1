package ru.mystudy.stepdefs;

import cucumber.api.java.ru.����;
import cucumber.api.java.ru.�����;
import cucumber.api.java.ru.�����;

public class StepDefinitions {
    @����("^�� ����� ������������ ������� (\\d+) ������$")
    public void ��������������������������������(int arg0) {
        System.out.println("�������������������������������� " + arg0);
    }

    @�����("^������������ ������� �� ����� (\\d+) ������$")
    public void ��������������������������������(int arg0) {
        System.out.println("�������������������������������� " + arg0);
    }

    @�����("^���������� �������������� \"([^\"]*)\"$")
    public void ������������������������(String arg0) {
        System.out.println("������������������������ " + arg0);
    }
}
