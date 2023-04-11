import java.util.Scanner;
public class NokiaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String clientName = input.nextLine();
        System.out.println(" Welcome " + clientName);
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "Press 1 for Phone book", "Press 2 for Messages", "Press 3 for Chat", "Press 4 for Call register", "Press 5 for Tones ",
                "Press 6 for Settings", "Press 7 for Call divert", "Press 8 for Games", "Press 9 for Calculator", "Press 10 for Reminder",
                "Press 11 for Clock", "Press 12 for Profiles", "Press 13 for SIM Services");
        System.out.println ("Please select an Option");
        Scanner option = new Scanner(System.in);
        int clientOption = option.nextInt();
        switch (clientOption) {
            case 1:
                System.out.println("Phone Book");
                System.out.println("Select an option: 1 for search, 2 for Service Nos, " +
                        "3: Add name, 4: Erase, 5: Edit, 6: Assign tone ");
                Scanner options = new Scanner(System.in);
                int phoneBook = options.nextInt();
                switch (phoneBook) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos");
                        break;
                    case 3:
                        System.out.print("Add Name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign Tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("Options 1: Type of view, or 2: Memory status ");
                        Scanner option1 = new Scanner(System.in);
                        int option8 = option1.nextInt();
                        switch (option8) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                break;
                        }
                }
              System.out.println("New message");
                System.out.println("Make a selection");
                Scanner messageAnew = new Scanner(System.in);
                int messagesAnew = messageAnew.nextInt();
                switch (messagesAnew) {
            case 2:
                System.out.println("Messages ");
            System.out.println("Select an option: 1: Write messages, 2: Inbox, 3: Outbox, 4: Picture Messages, " +
                    "5: Templates, 6: Smileys");
                Scanner options3 = new Scanner(System.in);
                int message = options3.nextInt();
                switch (message) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture Messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Message Settings: Set1 or Common");
                        Scanner optionsA = new Scanner(System.in);
                        int set1 = optionsA.nextInt();
                        switch (set1) {
                            case 1:
                                System.out.println("Message center number");
                                break;
                            case 2:
                                System.out.println("Message sent as");
                                break;
                            case 3:
                                System.out.println("Message validity");
                                break;
                        }
                        System.out.println("Common");
                        Scanner optionsB = new Scanner(System.in);
                        int common1 = optionsB.nextInt();
                        switch (common1) {
                            case 1:
                                System.out.println("Delivery Reports");
                                break;
                            case 2:
                                System.out.println("Reply via same center");
                                break;
                            case 3:
                                System.out.println("Character Support");
                                break;
                        }
                }
                    case 8:
                        System.out.println("Info Services");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                }
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.println("Call Register");
                System.out.println("Select from options 1: missed calls, 2: received calls, 3: dialed numbers" +
                        " 4: Erase recent  calls ");
                Scanner optionsC = new Scanner(System.in);
                int callRegister = optionsC.nextInt();
                switch (callRegister) {
                    case 1:
                        System.out.println("Missed Calls");
                        break;
                    case 2:
                        System.out.println("Received Calls");
                        break;
                    case 3:
                        System.out.println("Dialed numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent calls");
                        break;
                    case 5:
                        System.out.println("Show call duration");
                        System.out.println("Select from options 1 -5 ");
                        Scanner optionsD = new Scanner(System.in);
                        int callDuration = optionsD.nextInt();
                        switch (callDuration) {
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls duration");
                                break;
                            case 3:
                                System.out.println("Received calls' duration");
                                break;
                            case 4:
                                System.out.println("Dailed calls' duration");
                                break;
                            case 5:
                                System.out.println("Clear timers");
                                break;
                        }
                    case 6:
                        System.out.println("Show call costs");
                        System.out.println("Select from options 1 - 3 ");
                        Scanner optionsE = new Scanner(System.in);
                        int callCosts = optionsE.nextInt();
                        switch (callCosts) {
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.println("All calls' cost");
                                break;
                            case 3:
                                System.out.println("Clear counters");
                                break;
                        }
                    case 7:
                        System.out.println("Call cost settings");
                        System.out.println("Select either option 1 or 2 ");
                        Scanner optionsF = new Scanner(System.in);
                        int callCostSettings = optionsF.nextInt();
                        switch (callCostSettings) {
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show costs in");
                                break;
                        }
                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                }
            case 5:
                System.out.println("Tones");
                System.out.println("Select from options 1 -9 ");
                Scanner optionsG = new Scanner(System.in);
                int tones = optionsG.nextInt();
                switch (tones) {
                    case 1:
                        System.out.println("Ringing tone");
                        break;
                    case 2:
                        System.out.println("Ringing volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("Warning and game tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                }
            case 6:
                System.out.println("Settings");
                System.out.println("kindly select your desired options from 1 - 4 ");
                Scanner callSettings = new Scanner(System.in);
                int callSetting = callSettings.nextInt();
                switch (callSetting) {
                    case 1:
                        System.out.println(" Automatic Redial");
                        break;
                    case 2:
                        System.out.println(" Speed dialing ");
                        break;
                    case 3:
                        System.out.println("Call waiting options");
                        break;
                    case 4:
                        System.out.println("Own number sending");
                        break;
                    case 5:
                        System.out.println("Phone line in use");
                        break;
                    case 6:
                        System.out.println("Automatic answer");
                        break;
                }
            case 2:
                System.out.println("Phone Settings");
                System.out.println("Select from 1: Language," +
                        " 2: Cell info display, " +
                        "3: welcome note," +
                        "4: Network Selection," +
                        "5: Lights," +
                        "6: confirm SIM service options");
                Scanner phoneSettings = new Scanner(System.in);
                int phoneSetting = phoneSettings.nextInt();
                switch (phoneSetting) {
                    case 1:
                        System.out.println("Language");
                        break;
                    case 2:
                        System.out.println("Cell info display");
                        break;
                    case 3:
                        System.out.println("Welcome note");
                        break;
                    case 4:
                        System.out.println("Network Selection");
                        break;
                    case 5:
                        System.out.println("Lights");
                        break;
                    case 6:
                        System.out.println("Confirm SIM service options");
                        break;
                }
                System.out.println("Security Settings");
                System.out.println("Choose from 1 -6 ");
                Scanner securitySettingN = new Scanner(System.in);
                int securitySettingz = securitySettingN.nextInt();
                switch (securitySettingz) {
                    case 3:
                        System.out.println("Security Settings");
                        System.out.println("Choose from 1: PIN code request, 2: Call barring services," +
                                " 3: Fixed dialings, 4: Closed user group," +
                                " 5: Phone security, 6: Change access codes ");
                        Scanner securitySetting = new Scanner(System.in);
                        int securitySettings = securitySetting.nextInt();
                        switch (securitySettings) {
                            case 1:
                                System.out.println("PIN code request");
                                break;
                            case 2:
                                System.out.println("Call barring services");
                                break;
                            case 3:
                                System.out.println("Fixed dialings");
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                break;
                            case 5:
                                System.out.println("Phone security");
                                break;
                            case 6:
                                System.out.println("Change access codes");
                                break;
                        }
                }
                System.out.print("pick from the available options");
                Scanner optionZ = new Scanner(System.in);
                int optionZz = optionZ.nextInt();
                switch (optionZz) {
                    case 4:
                        System.out.println("Restore Factory Settings");
                        break;
                }
            case 7:
                System.out.println("Call Divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                System.out.println("Clock");
                System.out.println("pick from option 1: Alarm Clock, 2: Clock Settings," +
                        " 3: Date Settings, 4: Stopwatch, 5: Countdown timer," +
                        " 6: Autoupdate of date and time ");
                Scanner clock = new Scanner(System.in);
                int clockA = clock.nextInt();
                switch (clockA){
                    case 1:
                        System.out.println("Alarm Clock");
                        break;
                    case 2:
                        System.out.println("Clock settings");
                        break;
                    case 3:
                        System.out.println("Date settings");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown timer");
                        break;
                    case 6:
                        System.out.println("Autoupdate of date and time");
                        break;
                }
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
                break;
            default:
                System.out.println("Back to menu");
        }
    }
}