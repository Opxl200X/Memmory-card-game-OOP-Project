# Memory Card Game - OOP Project

เกมจับคู่การ์ด (Memory Card Game) นี้ถูกพัฒนาขึ้นในวิชา Object-Oriented Programming (OOP) โดยมีเป้าหมายเพื่อช่วยพัฒนาความจำและสมาธิของผู้เล่น โดยใช้ JavaFX ในการสร้างส่วนติดต่อผู้ใช้แบบกราฟิก (GUI)

## คุณสมบัติของระบบ

- **เกมจับคู่การ์ด:** ผู้เล่นต้องจับคู่การ์ดที่เหมือนกันทั้งหมดในเกม
- **แสดงผลคะแนน:**
  - จำนวนครั้งที่ผู้เล่นเดา (Guesses)
  - จำนวนคู่ที่ผู้เล่นจับได้ถูกต้อง (Correct)
- **ปุ่มการควบคุม:**
  - **Play Again:** เริ่มเกมใหม่พร้อมรีเซ็ตคะแนน
  - **Back:** กลับไปยังหน้าเมนูหลัก
- **ปรับขนาดหน้าจอ:** รองรับการแสดงผลบนจอความละเอียด 1280x720
- **ข้อความแสดงผล:** มีการแจ้งเตือนเมื่อจับคู่สำเร็จครบทุกคู่

## ขั้นตอนการติดตั้ง

### ความต้องการระบบ
- **Java Development Kit (JDK):** เวอร์ชัน 8 ขึ้นไป
- **JavaFX:** ไลบรารีที่ใช้สร้าง GUI (หาก JDK ไม่รวม JavaFX ให้ดาวน์โหลดแยก)
- **IDE:** เช่น IntelliJ IDEA, Eclipse หรือ NetBeans

### ดาวน์โหลดโปรเจกต์
ดาวน์โหลดหรือ clone โปรเจกต์จาก GitHub:
```bash
git clone https://github.com/HIimPuay/memory-card-game-oop-project.git

### โครงสร้างไฟล์
src/main/java/com/example/memorygame
  Main.java                    : ไฟล์หลักที่เริ่มการทำงานของระบบ
  MemoryGameController.java    : ควบคุมการทำงานของเกมและเชื่อมต่อกับอินเทอร์เฟซ
  MainMenuController.java      : ควบคุมการทำงานของหน้าหลักและเชื่อมต่อกับอินเทอร์เฟซ
  DeckOfCards.java             : จัดการสำรับการ์ด
  Card.java                    : จัดการการ์ด
  MemoryCard.java              : ตัวแทนของการ์ดแต่ละใบและสถานะ

src/main/resources/com/example/memorygame
  MemoryGame.fxml              : เลย์เอาต์ของเกม
  MainMenu.fxml                : เลย์เอาต์ของหน้าหลัก
  styles.css                   : สไตล์และธีมของระบบ
  images/                      : ไฟล์รูปภาพการ์ด
