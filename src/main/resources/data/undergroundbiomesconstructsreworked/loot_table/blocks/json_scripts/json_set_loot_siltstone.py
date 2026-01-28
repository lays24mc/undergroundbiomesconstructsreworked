import os

# Zielordner
BASE_DIR = r"C:\ModdingMC\undergroundbiomesconstructsreworked\src\main\resources\data\undergroundbiomesconstructsreworked\loot_table\blocks"

OLD_NAME = "siltstone"
NEW_NAME = input("Bitte gib den neuen Blocknamen ein (z.B. limestone): ").strip()

if not NEW_NAME:
    print("Kein Name eingegeben. Abbruch.")
    exit(1)

for filename in os.listdir(BASE_DIR):
    if filename.startswith(OLD_NAME) and filename.endswith(".json"):
        old_path = os.path.join(BASE_DIR, filename)

        # Neuer Dateiname
        new_filename = filename.replace(OLD_NAME, NEW_NAME, 1)
        new_path = os.path.join(BASE_DIR, new_filename)

        # JSON laden
        with open(old_path, "r", encoding="utf-8") as f:
            content = f.read()

        # Inhalt anpassen
        new_content = content.replace(OLD_NAME, NEW_NAME)

        # Neue Datei schreiben
        with open(new_path, "w", encoding="utf-8") as f:
            f.write(new_content)

        print(f"Erstellt: {new_filename}")

print("Fertig!")
