--master records
INSERT INTO DEPARTMENT (id, name) VALUES (1, 'Finance');
INSERT INTO DEPARTMENT (id, name) VALUES(2, 'Marketing');

INSERT INTO SALARY (id, base_salary) VALUES (1, 10000);
INSERT INTO SALARY (id, base_salary) VALUES (2, 20000);
INSERT INTO SALARY (id, base_salary) VALUES (3, 10000);
INSERT INTO SALARY (id, base_salary) VALUES (4, 20000);

INSERT INTO SALARY_COMPONENT (id, name, factor, salary_id) VALUES (1, 'bonus', 2, 1);
INSERT INTO SALARY_COMPONENT (id, name, factor, salary_id) VALUES (2, 'double bonus', 4, 1);
INSERT INTO SALARY_COMPONENT (id, name, factor, salary_id) VALUES (3, 'bonus two', 2, 2);
INSERT INTO SALARY_COMPONENT (id, name, factor, salary_id) VALUES (4, 'double bonus two', 4, 2);
INSERT INTO SALARY_COMPONENT (id, name, factor, salary_id) VALUES (5, 'bonus three', 2, 3);
INSERT INTO SALARY_COMPONENT (id, name, factor, salary_id) VALUES (6, 'double bonus three', 4, 4);

--transactional records
INSERT INTO EMPLOYEE (id, name, department_id, salary_id) VALUES (1, 'EmpSalaryOne FinanceDept',1, 1);
INSERT INTO EMPLOYEE (id, name, department_id, salary_id) VALUES (2, 'EmpSalaryTwo FinanceDept', 1, 2);
INSERT INTO EMPLOYEE (id, name, department_id, salary_id) VALUES (3, 'EmpSalaryOne MarketingDept', 2, 3);
INSERT INTO EMPLOYEE (id, name, department_id, salary_id) VALUES (4, 'EmpSalaryTwo MarketingDept', 2, 4);

