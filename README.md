# Appium Inspector Configuration

To configure the Appium Inspector, use the following desired capabilities for an Android device:

```json
{
  "platformName": "Android",
  "appium:platformVersion": "15",
  "appium:deviceName": "emulator-5554",
  "appium:automationName": "UiAutomator2",
  "appium:appPackage": "com.wdiodemoapp",
  "appium:appActivity": "com.wdiodemoapp.MainActivity"
}
```

AVD Details:
- AVD Name: Small Phone API 35
- Display Name: Small Phone API 35
- Encoding: UTF-8
- AvdId: Small_Phone_API_35
- Data Partition Size: 6442450944
- Fastboot Chosen Snapshot File: 
- Force Chosen Snapshot Boot: No
- Force Cold Boot: No
- Force Fast Boot: Yes
- Accelerometer: Yes
- ARC: False
- Audio Input: Yes
- Battery: Yes
- Back Camera: virtualscene
- Front Camera: emulated
- CPU Cores: 4
- Device Hash: MD5:d37b758e1a2b070e348378c2efde849a
- Device Manufacturer: Generic
- Device Name: small_phone
- D-Pad: No
- GPS: Yes
- GPU Enabled: Yes
- GPU Mode: Auto
- Initial Orientation: Portrait
- Keyboard: Yes
- LCD Density: 320
- LCD Height: 1280
- LCD Width: 720
- Main Keys: No
- RAM Size: 1024
- SD Card: Yes
- Orientation Sensor: Yes
- Proximity Sensor: Yes
- Trackball: No
- Android Version API: 35
- System Image Path: system-images\android-35\google_apis_playstore\x86_64\
- Play Store Enabled: Yes
- Network Latency: None
- Network Speed: Full
- Show Device Frame: No
- Dynamic Skin: Yes
- Backup Skin Path: _no_skin
- Display Tag: Google Play
- Display Names Tag: Google Play
- ID Tag: google_apis_playstore
- IDs Tag: google_apis_playstore
- VM Heap Size: 80

Adjust the configuration accordingly based on your AVD settings.

Ensure that you have the necessary dependencies and environment variables set up to run Appium and the AVD.

Feel free to modify the desired capabilities and AVD details as per your requirements.

If you have any further questions, feel free to ask!
