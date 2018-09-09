package ru.mystudy.stepdefs;

import cucumber.api.java.AfterStep;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.ru.��������;

import java.util.List;
import java.util.Map;

/**
 * � ������ � ������ ������ Cucumber ��� ����������� ���� ������������ ������ �������������� ���������� ���������
 * � ���������� XStreamsConverters.
 * � ������� ������ Cucumber ������������ ���������� �� ������������� ���������� XStreamsConverters
 * � �������� ��������� Cucumber Expressions.
 * <p>
 * ������������ ��� ������ �� XStreamConverters ���� ������ ������������, ���������� �����������
 * ������������� ��������� �������� ��������, � ��� �� ���������� ��������� Java 9.
 * <p>
 * Cucumber Expressions - ��� ������� ���� ��������� ��� ������ �������� � ������. � ������� �� ���������� ���������
 * �� ������������� ��� ���������������, � �� ��� �������� � ��������, ��� � ��������� Cucumber'� ����� ������� �����.
 */
public class DefaultTypesStepDefinitions {
    @��������("��������� � ����� ���� ����� ����� {int}")
    public void ���������_�_�����_����_�����_�����(Integer int1) {
        System.out.println(int1);
    }

    @��������("��������� � ����� ���� {string}")
    public void ���������_�_�����_����(String string) {
        System.out.println(string);
    }

    @��������("��������� � ����� ���� {word}")
    public void ���������_�_�����_����_�����(String string) {
        System.out.println(string);
    }

    @��������("��������� � ����� ��������� �����")
    public void ���������_�_�����_���������_�����(List<String> dataTable) {
        System.out.println(dataTable);
    }

    @��������("��������� � ����� ������������� ������")
    public void ���������_�_�����_�������������_������(Map<String, String> dataTable) {
        System.out.println(dataTable);
    }
}
