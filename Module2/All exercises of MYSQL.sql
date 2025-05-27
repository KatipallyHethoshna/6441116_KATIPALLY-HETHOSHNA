-- 1. Select all employees
SELECT * FROM employees;

-- 2. Select employee names and their salaries
SELECT employee_name, salary FROM employees;

-- 3. Find employees with salary greater than 50,000
SELECT * FROM employees
WHERE salary > 50000;

-- 4. Count total employees
SELECT COUNT(*) AS total_employees FROM employees;

-- 5. Find employees in department 10
SELECT * FROM employees
WHERE department_id = 10;

-- 6. Find employees ordered by salary descending
SELECT * FROM employees
ORDER BY salary DESC;

-- 7. Find distinct department IDs
SELECT DISTINCT department_id FROM employees;

-- 8. Find average salary of all employees
SELECT AVG(salary) AS average_salary FROM employees;

-- 9. Find minimum and maximum salary
SELECT MIN(salary) AS min_salary, MAX(salary) AS max_salary FROM employees;

-- 10. List employees whose salary is NULL
SELECT * FROM employees
WHERE salary IS NULL;

-- 11. Find employees who joined in the year 2023
SELECT * FROM employees
WHERE YEAR(join_date) = 2023;

-- 12. Retrieve the top 5 highest-paid employees
SELECT * FROM employees
ORDER BY salary DESC
LIMIT 5;

-- 13. Count the number of employees in each department
SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id;

-- 14. Find employees whose name starts with ‘A’
SELECT * FROM employees
WHERE employee_name LIKE 'A%';

-- 15. List departments with no employees
SELECT d.department_id, d.department_name
FROM departments d
LEFT JOIN employees e ON d.department_id = e.department_id
WHERE e.employee_id IS NULL;

-- 16. Find employees whose salary is between 50,000 and 100,000
SELECT * FROM employees
WHERE salary BETWEEN 50000 AND 100000;

-- 17. Get the average salary of employees by department
SELECT department_id, AVG(salary) AS avg_salary
FROM employees
GROUP BY department_id;

-- 18. List employees who do not have a manager
SELECT * FROM employees
WHERE manager_id IS NULL;

-- 19. Find the second highest salary in the employees table
SELECT MAX(salary) AS second_highest_salary
FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);

-- 20. Retrieve employee names and their manager’s names
SELECT e.employee_name, m.employee_name AS manager_name
FROM employees e
LEFT JOIN employees m ON e.manager_id = m.employee_id;

-- 21. Delete employees who have not been assigned to any project
DELETE FROM employees
WHERE employee_id NOT IN (SELECT employee_id FROM projects_employees);

-- 22. Find employees hired in the last 6 months
SELECT * FROM employees
WHERE hire_date >= DATE_SUB(CURDATE(), INTERVAL 6 MONTH);

-- 23. List employees ordered by department and then by salary descending
SELECT * FROM employees
ORDER BY department_id, salary DESC;

-- 24. Find the total salary expenditure by department
SELECT department_id, SUM(salary) AS total_salary
FROM employees
GROUP BY department_id;

-- 25. Find employees whose names contain ‘son’
SELECT * FROM employees
WHERE employee_name LIKE '%son%';
