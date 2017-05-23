# AndroidWithArduino
Send data from android app to LCD using Arduino mega ADK


Here is the arduino code:

#include <Max3421e.h>
#include <UsbHost.h>
#include <AndroidAccessory.h>
#include <LiquidCrystal.h>
#define  LED_PIN  13
AndroidAccessory acc("Manufacturer",
    "Model",
    "Description",
    "1.0",
    "http://yoursite.com",
                "0000000012345678");
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);  
          
void setup()
{
  // set communiation speed
  
  Serial.begin(115200);
  Serial.print("\r\nStart");
  Serial.flush();
  pinMode(LED_PIN, OUTPUT);
  acc.begin();
  lcd.begin(16, 2);
  lcd.print("Android..");
  
}

void loop()
{
  byte msg[1];
  
  if (acc.isConnected()) {
    if(acc.available()){
        lcd.clear();
      }
    while(acc.available() > 0) {
    lcd.write(acc.read());
  }
    lcd.setCursor(0,1);
    lcd.cursor();
  }
 delay(100);
  
}
