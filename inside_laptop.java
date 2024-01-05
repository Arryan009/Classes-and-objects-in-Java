import java.util.Scanner;
import java.io.*;

//declaring first class
class laptop {
    static String hardware;
    static String Software;
    static String Connectivity;
    static String Display;
    static int Input_Devices;
    static String Audio;
    static int Battery;
    static String Security;
    static String Design_Ergonomics;
    static String Customer_support_warranty;


//declaring member function for first class


static void get(){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the hardware components: ");
    hardware = obj.nextLine();
    System.out.println("Enter the number of Software: ");
    Software = obj.nextLine();
    System.out.println("Enter the Connectivity power: ");
    Connectivity = obj.nextLine();
    System.out.println("Enter the Display quality: ");
    Display = obj.nextLine();
    System.out.println("Enter the number of Input Devices: ");
    Input_Devices = obj.nextInt();
    System.out.println("Enter the Audio quality: ");
    Audio = obj.nextLine();
    System.out.println("Enter the Battery capacity: ");
    Battery = obj.nextInt();
    System.out.println("Enter the type of Security: ");
    Security = obj.nextLine();
    System.out.println("Enter the type of Design Ergonomics: ");
    Design_Ergonomics = obj.nextLine();
    System.out.println("Enter the type of Customer Support: ");
    Customer_support_warranty = obj.nextLine();
}


//declaring member function for first class



static void disp(){
        System.out.println("Laptop details: ");
        System.out.println("Hardware: "+hardware);
        System.out.println("Software: "+Software);
        System.out.println("Connectivity: "+Connectivity);
        System.out.println("Display: "+Display);
        System.out.println("Input Devices: "+Input_Devices);
        System.out.println("Audio: "+Audio);
        System.out.println("Battery: "+Battery);
        System.out.println("Security: "+Security);
        System.out.println("Design Ergonomics: "+Design_Ergonomics);
        System.out.println("Customer Support: "+Customer_support_warranty);
    }
}



//Declaring second class



class hardware{
    static String Processor;
    static int RAM;
    static int Storage;
    static int Graphics_card;
    static int display_size;
    static int battery_life;
    static int ports;
    static int weight;
    static String cooling_system;
    static String Build_quality;


    //declaring member function for second class



    static void get2(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of Processor: ");
        Processor = obj.nextLine();
        System.out.println("Enter the amount of RAM: ");
        RAM = obj.nextInt();
        System.out.println("Enter the amount of Storage: ");
        Storage = obj.nextInt();
        System.out.println("Enter the type of Graphics card: ");
        Graphics_card = obj.nextInt();
        System.out.println("Enter the type of display size: ");
        display_size = obj.nextInt();
        System.out.println("Enter the duration of battery life: ");
        battery_life = obj.nextInt();
        System.out.println("Enter the number of ports: ");
        ports = obj.nextInt();
        System.out.println("Enter the amount of weight: ");
        weight = obj.nextInt();
        System.out.println("Enter the type of cooling system: ");
        cooling_system = obj.nextLine();
    }


     //declaring member function for second class

    
    static void disp2(){
        System.out.println("Hardware details: ");
        System.out.println("Processor: "+Processor);
        System.out.println("RAM: "+RAM);
        System.out.println("Storage: "+Storage);
        System.out.println("Graphics card: "+Graphics_card);
        System.out.println("Display size: "+display_size);
        System.out.println("Battery life: "+battery_life);
        System.out.println("Ports: "+ports);
        System.out.println("Weight: "+weight);
        System.out.println("Cooling system: "+cooling_system);
    }
}


//Declaring third class



class Software{
    static String Operating_system;
    static int Pre_inst_software;
    static String compatibility;
    static String security_features;
    static int update_frequency;
    static String user_interface;
    static String bloatware;
    static int recovery_options;
    static String virtualisation;
    static String multi_tasking;


    //declaring member function for third class



    static void get3(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of Operating system: ");
        Operating_system = obj.nextLine();
        System.out.println("Enter the number of Pre-installed software: ");
        Pre_inst_software = obj.nextInt();
        System.out.println("Enter the type of compatibility: ");
        compatibility = obj.nextLine();
        System.out.println("Enter the type of security features: ");
        security_features = obj.nextLine();
        System.out.println("Enter the frequency of updates: ");
        update_frequency = obj.nextInt();
        System.out.println("Enter the type of user interface: ");
        user_interface = obj.nextLine();
        System.out.println("Enter the type of bloatware: ");
        bloatware = obj.nextLine();
        System.out.println("Enter the number of recovery options: ");
        recovery_options = obj.nextInt();
        System.out.println("Enter the type of virtualisation: ");
        virtualisation = obj.nextLine();
        System.out.println("Enter the type of multi-tasking: ");
        multi_tasking = obj.nextLine();
    }


    //declaring member function for third class



    static void disp3(){
        System.out.println("Software details: ");
        System.out.println("Operating system: "+Operating_system);
        System.out.println("Pre-installed software: "+Pre_inst_software);
        System.out.println("Compatibility: "+compatibility);
        System.out.println("Security features: "+security_features);
        System.out.println("Update frequency: "+update_frequency);
        System.out.println("User interface: "+user_interface);
        System.out.println("Bloatware: "+bloatware);
        System.out.println("Recovery options: "+recovery_options);
        System.out.println("Virtualisation: "+virtualisation);
        System.out.println("Multi-tasking: "+multi_tasking);
    } 
}


//Declaring fourth class



class Connectivity{
    static int Wifi_standards;
    static int Bluetooth_version;
    static String Ethernet_port;
    static int cellular;
    static String NFC;
    static String GPS;
    static String USB_C_support;
    static String Thunderbolt_support;
    static String SD_card;
    static String Docking_station;


    //declaring member function for fourth class



    static void get4(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of Wifi standards: ");
        Wifi_standards = obj.nextInt();
        System.out.println("Enter the type of Bluetooth version: ");
        Bluetooth_version = obj.nextInt();
        System.out.println("Enter the type of Ethernet port: ");
        Ethernet_port = obj.nextLine();
        System.out.println("Enter the type of cellular: ");
        cellular = obj.nextInt();
        System.out.println("Enter the type of NFC: ");
        NFC = obj.nextLine();
        System.out.println("Enter the type of GPS: ");
        GPS = obj.nextLine();
        System.out.println("Enter the type of USB-C support: ");
        USB_C_support = obj.nextLine();
        System.out.println("Enter the type of Thunderbolt support: ");
        Thunderbolt_support = obj.nextLine();
        System.out.println("Enter the type of SD card: ");
        SD_card = obj.nextLine();
        System.out.println("Enter the type of Docking station: ");
        Docking_station = obj.nextLine();
    }


    //declaring member function for fourth class



    static void disp4(){
        System.out.println("Connectivity details: ");
        System.out.println("Wifi standards: "+Wifi_standards);
        System.out.println("Bluetooth version: "+Bluetooth_version);
        System.out.println("Ethernet port: "+Ethernet_port);
        System.out.println("Cellular: "+cellular);
        System.out.println("NFC: "+NFC);
        System.out.println("GPS: "+GPS);
        System.out.println("USB-C support: "+USB_C_support);
        System.out.println("Thunderbolt support: "+Thunderbolt_support);
        System.out.println("SD card: "+SD_card);
        System.out.println("Docking station: "+Docking_station);
    }
}


//Declaring fifth class



class Display{
    static String Panel_type;
    static int Refresh_rate;
    static String color_accuracy;
    static int brightness;
    static int resolution;
    static String Touchscreen;
    static String Bezels;
    static int viewing_angle;
    static String HDR_support;
    static String Anti_glare;


    //declaring member function for fifth class



    static void get5(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of Panel type: ");
        Panel_type = obj.nextLine();
        System.out.println("Enter the type of Refresh rate: ");
        Refresh_rate = obj.nextInt();
        System.out.println("Enter the type of color accuracy: ");
        color_accuracy = obj.nextLine();
        System.out.println("Enter the type of brightness: ");
        brightness = obj.nextInt();
        System.out.println("Enter the type of resolution: ");
        resolution = obj.nextInt();
        System.out.println("Enter the type of Touchscreen: ");
        Touchscreen = obj.nextLine();
        System.out.println("Enter the type of Bezels: ");
        Bezels = obj.nextLine();
        System.out.println("Enter the type of viewing angle: ");
        viewing_angle = obj.nextInt();
        System.out.println("Enter the type of HDR support: ");
        HDR_support = obj.nextLine();
        System.out.println("Enter the type of Anti-glare: ");
        Anti_glare = obj.nextLine();
    }


    //declaring member function for fifth class



    static void disp5(){
        System.out.println("Display details: ");
        System.out.println("Panel type: "+Panel_type);
        System.out.println("Refresh rate: "+Refresh_rate);
        System.out.println("Color accuracy: "+color_accuracy);
        System.out.println("Brightness: "+brightness);
        System.out.println("Resolution: "+resolution);
        System.out.println("Touchscreen: "+Touchscreen);
        System.out.println("Bezels: "+Bezels);
        System.out.println("Viewing angle: "+viewing_angle);
        System.out.println("HDR support: "+HDR_support);
        System.out.println("Anti-glare: "+Anti_glare);
    }
}


//Declaring sixth class



class Input_Devices{
    static String Keyboard_type;
    static String Touchpad_quality;
    static String Backlit_keyboard;
    static String Fingerprint_sensor;
    static String Touchscreen;
    static String stylus_support;
    static String Track_point;
    static String Function_keys;
    static String Gesture_support;
    static String Externa_input;


    //declaring member function for sixth class


    static void get6(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of Keyboard type: ");
        Keyboard_type = obj.nextLine();
        System.out.println("Enter the type of Touchpad quality: ");
        Touchpad_quality = obj.nextLine();
        System.out.println("Enter the type of Backlit keyboard: ");
        Backlit_keyboard = obj.nextLine();
        System.out.println("Enter the type of Fingerprint sensor: ");
        Fingerprint_sensor = obj.nextLine();
        System.out.println("Enter the type of Touchscreen: ");
        Touchscreen = obj.nextLine();
        System.out.println("Enter the type of stylus support: ");
        stylus_support = obj.nextLine();
        System.out.println("Enter the type of Track point: ");
        Track_point = obj.nextLine();
        System.out.println("Enter the type of Function keys: ");
        Function_keys = obj.nextLine();
        System.out.println("Enter the type of Gesture support: ");
        Gesture_support = obj.nextLine();
        System.out.println("Enter the type of Externa input: ");
        Externa_input = obj.nextLine();
    }


    //declaring member function for sixth class


    static void disp6(){
        System.out.println("Input Devices details: ");
        System.out.println("Keyboard type: "+Keyboard_type);
        System.out.println("Touchpad quality: "+Touchpad_quality);
        System.out.println("Backlit keyboard: "+Backlit_keyboard);
        System.out.println("Fingerprint sensor: "+Fingerprint_sensor);
        System.out.println("Touchscreen: "+Touchscreen);
        System.out.println("Stylus support: "+stylus_support);
        System.out.println("Track point: "+Track_point);
        System.out.println("Function keys: "+Function_keys);
        System.out.println("Gesture support: "+Gesture_support);
        System.out.println("Externa input: "+Externa_input);
    }
}


//Declaring seventh class



class Audio{
    static String Speaker_quality;
    static String Audio_jack;
    static String Microphone;
    static String Dolby_atmos;
    static String Surround_sound;
    static String Audio_enhancements;
    static String Bluetooth_audio;
    static String Audio_codecs;
    static String Volume_levels;
    static String Speaker_placement;


    //declaring member function for seventh class


    static void get7(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of Speaker quality: ");
        Speaker_quality = obj.nextLine();
        System.out.println("Enter the type of Audio jack: ");
        Audio_jack = obj.nextLine();
        System.out.println("Enter the type of Microphone: ");
        Microphone = obj.nextLine();
        System.out.println("Enter the type of Dolby atmos: ");
        Dolby_atmos = obj.nextLine();
        System.out.println("Enter the type of Surround sound: ");
        Surround_sound = obj.nextLine();
        System.out.println("Enter the type of Audio enhancements: ");
        Audio_enhancements = obj.nextLine();
        System.out.println("Enter the type of Bluetooth audio: ");
        Bluetooth_audio = obj.nextLine();
        System.out.println("Enter the type of Audio codecs: ");
        Audio_codecs = obj.nextLine();
        System.out.println("Enter the type of Volume levels: ");
        Volume_levels = obj.nextLine();
        System.out.println("Enter the type of Speaker placement: ");
        Speaker_placement = obj.nextLine();
    }


    //declaring member function for seventh class



    static void disp7(){
        System.out.println("Audio details: ");
        System.out.println("Speaker quality: "+Speaker_quality);
        System.out.println("Audio jack: "+Audio_jack);
        System.out.println("Microphone: "+Microphone);
        System.out.println("Dolby atmos: "+Dolby_atmos);
        System.out.println("Surround sound: "+Surround_sound);
        System.out.println("Audio enhancements: "+Audio_enhancements);
        System.out.println("Bluetooth audio: "+Bluetooth_audio);
        System.out.println("Audio codecs: "+Audio_codecs);
        System.out.println("Volume levels: "+Volume_levels);
        System.out.println("Speaker placement: "+Speaker_placement);
    }
}



//Declaring eighth class



class Battery{
    static int Capacity;
    static String Battery_type;
    static int Charging_time;
    static String Power_management;
    static int charging_cycles;
    static String Battery_health;
    static int Adapter_size;
    static String Fast_charging;
    static String USB_power_delivery;
    static String Adaptive_charging;


    //declaring member function for eighth class


    static void get8(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of Capacity: ");
        Capacity = obj.nextInt();
        System.out.println("Enter the type of Battery type: ");
        Battery_type = obj.nextLine();
        System.out.println("Enter the type of Charging time: ");
        Charging_time = obj.nextInt();
        System.out.println("Enter the type of Power management: ");
        Power_management = obj.nextLine();
        System.out.println("Enter the type of charging cycles: ");
        charging_cycles = obj.nextInt();
        System.out.println("Enter the type of Battery health: ");
        Battery_health = obj.nextLine();
        System.out.println("Enter the type of Adapter size: ");
        Adapter_size = obj.nextInt();
        System.out.println("Enter the type of Fast charging: ");
        Fast_charging = obj.nextLine();
        System.out.println("Enter the type of USB power delivery: ");
        USB_power_delivery = obj.nextLine();
        System.out.println("Enter the type of Adaptive charging: ");
        Adaptive_charging = obj.nextLine();
    }


    //declaring member function for eighth class


    static void disp8(){
        System.out.println("Battery details: ");
        System.out.println("Capacity: "+Capacity);
        System.out.println("Battery type: "+Battery_type);
        System.out.println("Charging time: "+Charging_time);
        System.out.println("Power management: "+Power_management);
        System.out.println("Charging cycles: "+charging_cycles);
        System.out.println("Battery health: "+Battery_health);
        System.out.println("Adapter size: "+Adapter_size);
        System.out.println("Fast charging: "+Fast_charging);
        System.out.println("USB power delivery: "+USB_power_delivery);
        System.out.println("Adaptive charging: "+Adaptive_charging);
    }
}


//Declaring ninth class


class Security{
    static String Biometric_authentication;
    static String TPM;
    static String Kensington_lock;
    static String Privacy_shutter;
    static String Secure_boot;
    static String Device_encryption;
    static String Antivirus_software;
    static String Firmware_security;
    static String Two_factor_authentication;
    static String Security_updates;


    //declaring member function for ninth class


    static void get9(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of Biometric authentication: ");
        Biometric_authentication = obj.nextLine();
        System.out.println("Enter the type of TPM: ");
        TPM = obj.nextLine();
        System.out.println("Enter the type of Kensington lock: ");
        Kensington_lock = obj.nextLine();
        System.out.println("Enter the type of Privacy shutter: ");
        Privacy_shutter = obj.nextLine();
        System.out.println("Enter the type of Secure boot: ");
        Secure_boot = obj.nextLine();
        System.out.println("Enter the type of Device encryption: ");
        Device_encryption = obj.nextLine();
        System.out.println("Enter the type of Antivirus software: ");
        Antivirus_software = obj.nextLine();
        System.out.println("Enter the type of Firmware security: ");
        Firmware_security = obj.nextLine();
        System.out.println("Enter the type of Two factor authentication: ");
        Two_factor_authentication = obj.nextLine();
        System.out.println("Enter the type of Security updates: ");
        Security_updates = obj.nextLine();
    }


    //declaring member function for ninth class


    static void disp9(){
        System.out.println("Security details: ");
        System.out.println("Biometric authentication: "+Biometric_authentication);
        System.out.println("TPM: "+TPM);
        System.out.println("Kensington lock: "+Kensington_lock);
        System.out.println("Privacy shutter: "+Privacy_shutter);
        System.out.println("Secure boot: "+Secure_boot);
        System.out.println("Device encryption: "+Device_encryption);
        System.out.println("Antivirus software: "+Antivirus_software);
        System.out.println("Firmware security: "+Firmware_security);
        System.out.println("Two factor authentication: "+Two_factor_authentication);
        System.out.println("Security updates: "+Security_updates);
    }
}


//Declaring tenth class


class Design_Ergonomics{
    static String Thiness_thickness;
    static String Aesthetics;
    static String Material_quality;
    static String Durability;
    static String Portability;
    static String heat_dissipation;
    static String Ergonomics_considerations;
    static String detachable_design;
    static int Dislay_bezel;
    static String Build_form;


    //declaring member function for tenth class


    static void get10(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of Thiness thickness: ");
        Thiness_thickness = obj.nextLine();
        System.out.println("Enter the type of Aesthetics: ");
        Aesthetics = obj.nextLine();
        System.out.println("Enter the type of Material quality: ");
        Material_quality = obj.nextLine();
        System.out.println("Enter the type of Durability: ");
        Durability = obj.nextLine();
        System.out.println("Enter the type of Portability: ");
        Portability = obj.nextLine();
        System.out.println("Enter the type of heat dissipation: ");
        heat_dissipation = obj.nextLine();
        System.out.println("Enter the type of Ergonomics considerations: ");
        Ergonomics_considerations = obj.nextLine();
        System.out.println("Enter the type of detachable design: ");
        detachable_design = obj.nextLine();
        System.out.println("Enter the type of Dislay bezel: ");
        Dislay_bezel = obj.nextInt();
        System.out.println("Enter the type of Build form: ");
        Build_form = obj.nextLine();
    }


    //declaring member function for tenth class


    static void disp10(){
        System.out.println("Design Ergonomics details: ");
        System.out.println("Thiness thickness: "+Thiness_thickness);
        System.out.println("Aesthetics: "+Aesthetics);
        System.out.println("Material quality: "+Material_quality);
        System.out.println("Durability: "+Durability);
        System.out.println("Portability: "+Portability);
        System.out.println("Heat dissipation: "+heat_dissipation);
        System.out.println("Ergonomics considerations: "+Ergonomics_considerations);
        System.out.println("Detachable design: "+detachable_design);
        System.out.println("Dislay bezel: "+Dislay_bezel);
        System.out.println("Build form: "+Build_form);
    }
}


//Declaring eleventh class


class Customer_support_warranty{
    static String warranty_duration;
    static String Customer_service;
    static String Online_support;
    static String Repairability;
    static String Return_policy;
    static String Warranty_extension;
    static String Support_forums;
    static String Repair_service;
    static int Response_time;


    //declaring member function for eleventh class


    static void get11(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the type of warranty duration: ");
        warranty_duration = obj.nextLine();
        System.out.println("Enter the type of Customer service: ");
        Customer_service = obj.nextLine();
        System.out.println("Enter the type of Online support: ");
        Online_support = obj.nextLine();
        System.out.println("Enter the type of Repairability: ");
        Repairability = obj.nextLine();
        System.out.println("Enter the type of Return policy: ");
        Return_policy = obj.nextLine();
        System.out.println("Enter the type of Warranty extension: ");
        Warranty_extension = obj.nextLine();
        System.out.println("Enter the type of Support forums: ");
        Support_forums = obj.nextLine();
        System.out.println("Enter the type of Repair service: ");
        Repair_service = obj.nextLine();
        System.out.println("Enter the type of Response time: ");
        Response_time = obj.nextInt();
    }


    //declaring member function for eleventh class


    static void disp11(){
        System.out.println("Customer support warranty details: ");
        System.out.println("Warranty duration: "+warranty_duration);
        System.out.println("Customer service: "+Customer_service);
        System.out.println("Online support: "+Online_support);
        System.out.println("Repairability: "+Repairability);
        System.out.println("Return policy: "+Return_policy);
        System.out.println("Warranty extension: "+Warranty_extension);
        System.out.println("Support forums: "+Support_forums);
        System.out.println("Repair service: "+Repair_service);
        System.out.println("Response time: "+Response_time);
    }
}


public class inside_laptop{
    public static void main(String[] args) {
        laptop obj1=new laptop();
        hardware obj2=new hardware();
        Software obj3=new Software();
        Connectivity obj4=new Connectivity();
        Display obj5=new Display();
        Input_Devices obj6=new Input_Devices();
        Audio obj7=new Audio();
        Battery obj8=new Battery();
        Security obj9=new Security();
        Design_Ergonomics obj10=new Design_Ergonomics();
        Customer_support_warranty obj11=new Customer_support_warranty();

        obj1.get();
        obj1.disp();


        obj2.get2();
        obj2.disp2();


        obj3.get3();
        obj3.disp3();


        obj4.get4();
        obj4.disp4();


        obj5.get5();
        obj5.disp5();


        obj6.get6();
        obj6.disp6();


        obj7.get7();
        obj7.disp7();


        obj8.get8();
        obj8.disp8();


        obj9.get9();
        obj9.disp9();


        obj10.get10();
        obj10.disp10();


        obj11.get11();
        obj11.disp11();
    }
}