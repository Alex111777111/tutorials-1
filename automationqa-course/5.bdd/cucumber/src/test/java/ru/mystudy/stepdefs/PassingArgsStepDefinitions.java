package ru.mystudy.stepdefs;

import cucumber.api.java.ru.��������;

/**
 * � ������ � ������ ������ Cucumber ��� ����������� ���� ������������ ������ �������������� ���������� ���������
 * � ���������� XStreamsConverters.
 * � ������� ������ Cucumber ������������ ���������� �� ������������� ���������� XStreamsConverters
 * � �������� ��������� Cucumber Expressions.

 * ������������ ��� ������ �� XStreamConverters ���� ������ ������������, � ��� �� ���������� �����������
 * ������������� ��������� �������� �������� � ��������� Java 9.

 * Cucumber Expressions - ��� ������� ���� ��������� ��� ������ �������� � ������. � ������� �� ���������� ���������
 * �� ������������� ��� ���������������, � �� ��� �������� � ��������, ��� � ��������� Cucumber'� ����� ������� �����.
 */
public class PassingArgsStepDefinitions {
    @��������("��������� � ����� ���� ����� ����� {int}")
    public void ���������_�_�����_����_�����_�����(Integer int1) {
        System.out.println(int1);
    }

    @��������("��������� � ����� ���� {string}")
    public void ���������_�_�����_����(String string) {
        System.out.println(string);
    }
}
