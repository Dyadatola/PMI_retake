import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DentistTest {

    // TODO: Uncomment testcase to test newAppointment method.
    /*
    @Test
    public void testNewAppointment() {
        Dentist dentist = new Dentist();
        assertTrue(dentist.getAppointments().isEmpty());

        String patientName1 = "John Doe";
        String timestamp1 = "12:00";
        dentist.newAppointment(patientName1, timestamp1);
        assertEquals(patientName1 + " " + timestamp1, dentist.getAppointments());

        String patientName2 = "Ben Ten";
        String timestamp2 = "10:30";
        dentist.newAppointment(patientName2, timestamp2);
        assertEquals(patientName1 + " " + timestamp1 + "\r\n" + patientName2 + " " + timestamp2, dentist.getAppointments());

        String patientName3 = "John Doe";
        String timestamp3 = "08:00";
        dentist.newAppointment(patientName3, timestamp3);
        assertEquals(patientName1 + " " + timestamp1 + "\r\n" + patientName2 + " " + timestamp2, dentist.getAppointments());
    }
    */

    // TODO: Uncomment testcase to test resign method.
    /*
    @Test
    public void testResign() {
        Dentist chef = new Dentist();
        assertTrue(chef.getAppointments().isEmpty());

        String patientName1 = "John Doe";
        String timestamp1 = "12:00";

        chef.resign(patientName1);

        chef.newAppointment(patientName1, timestamp1);
        assertEquals(patientName1 + " " + timestamp1, chef.getAppointments());

        String patientName2 = "Ben Ten";
        String timestamp2 = "10:30";
        chef.newAppointment(patientName2, timestamp2);
        assertEquals(patientName1 + " " + timestamp1 + "\r\n" + patientName2 + " " + timestamp2, chef.getAppointments());

        chef.resign(patientName1);

        assertEquals(patientName2 + " " + timestamp2, chef.getAppointments());

        chef.resign(patientName2);
        assertTrue(chef.getAppointments().isEmpty());
    }
    */

    // TODO: Uncomment testcase to test refreshAppointment method.
    /*
    @Test
    public void testAssistant() {
        Assistant assistant = new Assistant();
        String patientName1 = "John Doe";
        String patientName2 = "Ben Ten";
        String timestamp1 = "12:00";
        String timestamp2 = "10:30";

        assistant.newAppointment(patientName1, timestamp1);
        assistant.newAppointment(patientName2, timestamp2);

        assistant.refreshAppointment(patientName1, timestamp2);
        assertEquals(patientName1 + " " + timestamp2 + "\r\n" + patientName2 + " " + timestamp2, assistant.getAppointments());

        assistant.refreshAppointment(patientName2, timestamp1);
        assertEquals(patientName1 + " " + timestamp2 + "\r\n" + patientName2 + " " + timestamp1, assistant.getAppointments());

        assistant.refreshAppointment(patientName2, timestamp2);
        assertEquals(patientName1 + " " + timestamp2 + "\r\n" + patientName2 + " " + timestamp2, assistant.getAppointments());

        assistant.refreshAppointment("not real", timestamp1);
        assertEquals(patientName1 + " " + timestamp2 + "\r\n" + patientName2 + " " + timestamp2, assistant.getAppointments());
    }
    */
}
