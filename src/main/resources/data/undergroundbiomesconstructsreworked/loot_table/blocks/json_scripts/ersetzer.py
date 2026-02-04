from pathlib import Path

BASE_PATH = Path(
    r"C:\ModdingMC\undergroundbiomesconstructsreworked"
    r"\src\main\resources\data"
    r"\undergroundbiomesconstructsreworked"
    r"\loot_table\blocks"
)

SOURCE_NAME = "soapstone_stone_button.json"
SOURCE_BLOCK = "soapstone"
SUFFIX = "_stone_button"

def replace_block(new_block):
    source_file = BASE_PATH / SOURCE_NAME
    target_file = BASE_PATH / f"{new_block}{SUFFIX}.json"

    if not source_file.exists():
        print(f"❌ Quelldatei nicht gefunden:\n{source_file}")
        return

    # Datei als Text lesen (wichtig für vollständigen Ersatz)
    content = source_file.read_text(encoding="utf-8")

    # Blocknamen im JSON ersetzen
    content = content.replace(SOURCE_BLOCK, new_block)

    # Neue Datei schreiben
    target_file.write_text(content, encoding="utf-8")

    print("✅ Erfolgreich erstellt:")
    print(f"   {target_file.name}")

if __name__ == "__main__":
    new_block = input("🧱 Neuer Blockname (z.B. granite): ").strip()
    replace_block(new_block)
