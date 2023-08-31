package Siniflar;

public class Employee {
   String name;
   double salary;
   int workHours;
   int hireYear;

   Employee(String name,double salary,int workHours, int hireYear){
       this.name=name;
       this.salary=salary;
       this.workHours=workHours;
       this.hireYear=hireYear;
   }

   double tax(double salary){
       if (salary <= 1000) {
           return salary;
       }else {
           return (this.salary*0.03);
       }
   }
   int bonus(int workHours){
       if(workHours > 40){
           return ((workHours-40) *30);

       }
       return 0;
   }
   double raiseSalary(int hireYear){
       if (2021 - this.hireYear < 10){
           return this.salary*0.05;
       }else if ((2021 - this.hireYear >= 10) && (2021 - this.hireYear < 20)) {
           return  this.salary*0.10;
       } else if (2021-this.hireYear >= 20) {
           return this.salary * 0.15;
       }else {
           return this.salary;
       }
   }
   void details(){
       System.out.println("Adınız : "+this.name);
       System.out.println("Maaşı : "+this.salary);
       System.out.println("Çalışma Saati : "+this.workHours);
       System.out.println("Başlangıç Yılı : "+this.hireYear);
       System.out.println("Vergi : "+this.tax(this.salary));
       System.out.println("Bonus : "+this.bonus(this.workHours));
       System.out.println("Maaş Artışı : "+this.raiseSalary(this.hireYear));
       System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+((this.tax(this.salary) )+ this.bonus(this.workHours) + (this.salary) ));
       System.out.println("Toplam Maaş : "+((this.bonus(this.workHours))+(this.raiseSalary(this.hireYear)) + (this.tax(this.salary)) + (this.salary)));

   }
}
