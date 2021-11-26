class employeeSalary {
    double basic, da, hra, ma;

    employeeSalary(double b, double d, double h, double m) 
    {
        basic = b;
        hra = h;
        da = d;
        ma = m;
    }

    double regular_salary() {
        return (basic + hra + da + ma);
    }
}

class scientist extends employeeSalary {
    double bonus_per_publications, number_of_publications;

    scientist(double b, double d, double h, double m, double bpp, double nop)
    {
        super(b, d, h, m);
        bonus_per_publications = bpp;
        number_of_publications = nop;
    }

    double net_bonus() {
        return number_of_publications * bonus_per_publications;
    }

    double net_salary() {
        return (regular_salary() + net_bonus());
    }
}

class developer extends employeeSalary {
    double bonus_per_patent, number_of_patents;

    developer(double b, double d, double h, double m, double bpp, double nop)
    {
        super(b, d, h, m);
        bonus_per_patent = bpp;
        number_of_patents = nop;
    }

    double net_bonus() {
        return number_of_patents * bonus_per_patent;
    }

    double net_salary() {
        return (regular_salary() + net_bonus());
    }
}

class projectLeader extends employeeSalary {
    double bonus_per_patent, number_of_patents;

    projectLeader(double b, double d, double h, double m, double bpp, double nop)
    {
        super(b, d, h, m);
        bonus_per_patent = bpp;
        number_of_patents = nop;
    }

    double net_bonus() {
        return number_of_patents * bonus_per_patent;
    }

    double net_salary() {
        return (regular_salary() + net_bonus());
    }
}

public class salary
{
    public static void main(String[] args)
    {
        scientist sc = new scientist(22000, 2200, 1600, 300, 1000, 5);
        developer dv = new developer(23000, 2300, 1600, 300, 1500, 5);
        projectLeader pl = new projectLeader(30000, 2300, 1600, 300, 2000, 5);

        System.out.println("Designation\tNet Salary");
        System.out.println("Scientist\t " + sc.net_salary());
        System.out.println("Developer\t " + dv.net_salary());
        System.out.println("ProjectLeader\t " + pl.net_salary());
    }
}

