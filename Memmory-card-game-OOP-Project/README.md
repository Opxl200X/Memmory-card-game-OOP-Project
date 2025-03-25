# OOP Project - เกมจับคู่การ์ด (Memory Card Game)

เกมจับคู่การ์ด (Memory Card Game) นี้ถูกพัฒนาขึ้นในวิชา **Object-Oriented Programming (OOP)** โดยมีเป้าหมายเพื่อช่วยพัฒนาความจำและสมาธิของผู้เล่น โดยใช้ **JavaFX** ในการสร้างส่วนติดต่อผู้ใช้แบบกราฟิก (GUI)

---

## คุณสมบัติของระบบ
1. **เกมจับคู่การ์ด:** ผู้เล่นต้องจับคู่การ์ดที่เหมือนกันทั้งหมดในเกม
2. **แสดงผลคะแนน:** 
   - จำนวนครั้งที่ผู้เล่นเดา (Guesses)
   - จำนวนคู่ที่ผู้เล่นจับได้ถูกต้อง (Correct)
3. **ปุ่มการควบคุม:** 
   - **Play Again:** เริ่มเกมใหม่พร้อมรีเซ็ตคะแนน
   - **Back:** กลับไปยังหน้าเมนูหลัก
4. **ปรับขนาดหน้าจอ:** รองรับการแสดงผลบนจอความละเอียด 1280x720
5. **ข้อความแสดงผล:** มีการแจ้งเตือนเมื่อจับคู่สำเร็จครบทุกคู่

---

## ขั้นตอนการติดตั้ง

### ความต้องการระบบ
- **Java Development Kit (JDK)**: เวอร์ชัน 8 ขึ้นไป
- **JavaFX**: ไลบรารีที่ใช้สร้าง GUI (หาก JDK ไม่รวม JavaFX ให้ดาวน์โหลดแยก)
- **IDE**: เช่น IntelliJ IDEA, Eclipse หรือ NetBeans

#### ดาวน์โหลดโปรเจกต์
- ดาวน์โหลดหรือ clone โปรเจกต์จาก GitHub:
   ```bash
   git clone https://github.com/HIimPuay/memory-card-game-oop-project.git

## วิธีการรันระบบ
1. หลังจากดาวน์โหลดโฟลเดอร์ **Match-card** เรียบร้อยแล้ว
2. ไปยังโฟลเดอร์:
Match-card\src\main\java\com\example\memorygame
3. เปิดไฟล์ `Main.java` ใน IDE
4. รันไฟล์ `Main.java` เพื่อเริ่มเกม


## โครงสร้างไฟล์
1. **`src/main/java/com/example/memorygame`**
- `Main.java`: ไฟล์หลักที่เริ่มการทำงานของระบบ
- `MemoryGameController.java`: ควบคุมการทำงานของเกมและเชื่อมต่อกับอินเทอร์เฟซ
- `MainMenuController.java`: ควบคุมการทำงานของหน้าหลักและเชื่อมต่อกับอินเทอร์เฟซ
- `DeckOfCards.java`: จัดการสำรับการ์ด
- `Card.java`: จัดการการ์ด
- `MemoryCard.java`: ตัวแทนของการ์ดแต่ละใบและสถานะ
2. **`src/main/resources/com/example/memorygame`**
- `MemoryGame.fxml`: เลย์เอาต์ของเกม
- `MainMenu.fxml`: เลย์เอาต์ของหน้าหลัก
- `styles.css`: สไตล์และธีมของระบบ
- `images/`: ไฟล์รูปภาพการ์ด
