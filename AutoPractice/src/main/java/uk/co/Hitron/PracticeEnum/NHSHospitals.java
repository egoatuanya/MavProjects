package uk.co.Hitron.PracticeEnum;

public class NHSHospitals
{
    enum Hospitals
    {
        Basildon,
        Newham,
        Orsett,
        Kings_College,
        King_George,
        Royal_Free


    }
    public static String getNHSHospital(Hospitals hospital)
    {
        if(hospital.equals(Hospitals.Basildon))
        {
            return "You live in Essex";
        }else if(hospital.equals(Hospitals.King_George))
    {
        return "You live in Romford";
    }
        else if(hospital.equals(Hospitals.Kings_College))
        {
            return "You live in London";
        }
        else{return null;}
    }

    public static void main (String [] args)
    {
        String myHospital = getNHSHospital(Hospitals.Basildon);
        System.out.println(myHospital);

    }

}

