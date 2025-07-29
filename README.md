# AI-BASED-RECOMMENDATION-SYSTEM

*COMPANY*: CODTECH IT SOLUTIONS

*NAME* : JAYASREE S

*INTERN ID*: CT04DZ450

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

---

# 🔄 Auto-Execution of `like.exe.csv` using PowerShell and Batch Script

This repository contains a simple automation utility that opens a specially named file (`like.exe.csv`) automatically using PowerShell and Batch scripting on Windows. It is useful in cases where you need to simulate opening of unusual file types, automate file interactions, or create demonstrations involving file-based automation. This setup is lightweight and ideal for both educational and practical scripting purposes.

---

## 📖 Description

The purpose of this utility is to automatically open a file named `like.exe.csv` from a predefined folder. Files with compound extensions like `.exe.csv` often occur in controlled test environments, data logging systems, or during virus sandboxing demonstrations. Manually locating and opening these files each time can be tedious — this script eliminates that need.

The PowerShell script (`run-csv.ps1`) uses native Windows functionality to locate the target file and open it using the default application associated with `.csv` files. The Batch script (`run_csv.bat`) is designed for quick execution: double-clicking this file will run the PowerShell script silently.

The CSV file (`like.exe.csv`) itself can be a test file or log data file generated from other software. This utility helps in making sure it's accessible with one click.

---

## 💡 Where This Utility Can Be Used

This automation can be applied in various areas, such as:

- **🧪 Test Automation**: When test outputs are generated with unusual file names like `output.exe.csv`.
- **📊 Data Logs**: Logs from systems that name files with multiple extensions (e.g., telemetry or debugging tools).
- **🖥️ UI Demonstrations**: During workshops or demo sessions where you want to automatically open files for display.
- **🗂️ File Association Testing**: When evaluating how operating systems handle compound extensions.
- **🔒 Malware Sandbox Simulations**: For researchers simulating safe opening of suspicious files in a controlled environment.

---

## ⚙️ Tools & Technologies Used

| Technology         | Purpose                                                                 |
|--------------------|-------------------------------------------------------------------------|
| PowerShell         | Script automation and opening files based on Windows registry settings. |
| Batch File         | Quick execution of PowerShell scripts through double-click.             |
| Windows OS         | Platform where the automation runs.                                     |
| Notepad/Excel      | Programs typically associated with `.csv` file types.                   |
| Visual Studio Code | Optional, for editing `.ps1` and `.bat` files.                          |

---

## 📂 Folder Structure

```plaintext
TASK - 4/
├── like.exe.csv      # Sample CSV file to be opened
├── run-csv.ps1       # PowerShell script to open the CSV file
├── run_csv.bat       # Batch file to trigger the PowerShell script
```
---
## ▶️ How to Run

### ✅ Prerequisites
- Java JDK 8 or higher
- Apache Maven
- dataset.csv (with user-item-rating format, e.g., `1,101,5.0`)
---
### PowerShell command 
```bash
cd "C:\Users\Welcome\Downloads\TASK - 4"
mvn clean
mvn compile
mvn exec:java
```
---

### OUTPUT
