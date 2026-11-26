
import time
from datetime import datetime
import winsound

# Ask the user to enter alarm time
alarm_time = input("Enter alarm time (HH:MM:SS): ")

print(f"Alarm set for {alarm_time}")

while True:
    current_time = datetime.now().strftime("%H:%M:%S")

    if current_time == alarm_time:
        print("Wake Up! Your alarm is ringing!")

        # Play alarm sound
        for i in range(5):
            winsound.Beep(1000, 1000)
            time.sleep(1)

        break

    time.sleep(1)
