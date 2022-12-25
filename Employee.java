class Employee
{
   private int empId;
   private String empName;
   private String empCity;
   
   Employee(int empId, String empName, String empCity)
   {
    empId = this.empId;
	empName = this.empName;
	empCity = this.empCity;
   }
   
   public void setEmpId(int empId)
   {
    this.empId = empId;
   }
   
   public int getEmpId()
   {
    return this.empId;
   }
   
   public void setEmpId(String empName)
   {
    this.empName = empName;
   }
   
   public String getEmpName()
   {
    return this.empName;
   }
   
   public void setEmpCity(String empCity)
   {
    this.empCity = empCity;
   }
   
   public String getEmpCity()
   {
    return this.empCity;
   }
}