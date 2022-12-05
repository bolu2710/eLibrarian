import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class speech_login extends mainapp {

    public static void main(String[] args) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        Voice[] voicelist = VoiceManager.getInstance().getVoices();
        for (int i = 0; i < voicelist.length; i++) {
             System.out.println("Voice: " + voicelist[i].getName());
        }

        if (voice != null) {
            voice.allocate();
             //System.out.println("rate: " + voice.getRate());

             //System.out.println("pitch: " + voice.getPitch());

            // System.out.println("volume: " + voice.getVolume());
             
            boolean status = voice.speak(" Login success. Welcome to the Main Menu. ENTER 'B' to view the list of books from the database. ENTER 'S' to search for a book from the database. ENTER 'U' to view your account info. ");

             //System.out.println("status: " + status);
            voice.deallocate();
        } else {
            System.out.println("Error");
        }
    }
}