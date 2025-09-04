fun main() {
    val employeeSalaryExpenses = TOTAL_EMPLOYEES * EMPLOYEE_SALARY
    println(employeeSalaryExpenses)
    val internSalaryExpenses = TOTAL_INTERNS * INTERN_SALARY
    val generalExpenses = employeeSalaryExpenses + internSalaryExpenses
    println(generalExpenses)
    val averageSalary = generalExpenses / (TOTAL_EMPLOYEES + TOTAL_INTERNS)
    println(averageSalary)
}
const val TOTAL_EMPLOYEES = 50
const val TOTAL_INTERNS = 30
const val EMPLOYEE_SALARY = 30000
const val INTERN_SALARY = 20000