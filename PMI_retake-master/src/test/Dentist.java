public class Dentist {
    
    public static String[] patientNames;
    public static int n = 0;
    public static String[] timestamps;

    
    static void newAppointment(String patientName, String timestamp)
    {
        String[] temp_patientNames = new String[n+1];
        try {
            for (int i=0; i<n; i++) {
                temp_patientNames[i] = patientNames[i];
            }
        }
        catch (Exception e) {
            ;
        }
        temp_patientNames[n] = patientName;
        patientNames = temp_patientNames;

        String[] temp_timestamps = new String[n+1];   
        try {
            for (int i=0; i<n; i++) {
                temp_timestamps[i] = timestamps[i];
            }
        }
        catch (Exception e) {
            ;
        }
        temp_timestamps[n] = timestamp;
        timestamps = temp_timestamps;
        n+=1;
    }
    static void Print_appointments() {
        System.out.println("Apointments:");
        for (int i=0; i<n; i++) {
            if (patientNames[i]!=null) {
                System.out.println("    "+patientNames[i]+" "+timestamps[i] + "\n");
            }
        }
        System.out.println("\n");
    }
    static void resign(String patientName)
    {
        for (int i=0; i<n; i++){
            if (patientNames[i]==patientName){
                for (int j=0; j<n-1; j++) {
                    patientNames[j] = patientNames[j+1];
                    timestamps[j] = timestamps[j+1];
                }
                patientNames[n-1] = null;
                timestamps[n-1] = null;
                break;
            }
        }
    }


    public static void main(String[] atgs) {
        String patientName1 = "John Doe";
        String timestamp1 = "12:00";
        newAppointment(patientName1, timestamp1);
        Print_appointments();

        String patientName2 = "Ben Ten";
        String timestamp2 = "10:30";
        newAppointment(patientName2, timestamp2);
        Print_appointments();

        String patientName3 = "John Doe";
        String timestamp3 = "08:00";
        newAppointment(patientName3, timestamp3);
        Print_appointments();

        resign(patientName1);
        Print_appointments();
    }
}