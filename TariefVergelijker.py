DAG_TARIEF = 25;
UUR_TARIEF = 40;
OVERWERK_TARIEF = 60;

aantalDagen = 1
n = float(input())

if n <= 8:
    prijs = DAG_TARIEF + n * UUR_TARIEF
else:
    prijsMetOverwerk = DAG_TARIEF + (n-8) * OVERWERK_TARIEF + 8 * UUR_TARIEF
    prijsMetTweeDagen = 2 * DAG_TARIEF + n * UUR_TARIEF

    if prijsMetOverwerk < prijsMetTweeDagen:
        prijs = prijsMetOverwerk;
    else:
        prijs = prijsMetTweeDagen;
        aantalDagen = 2;

print("Beste is ", aantalDagen, " dagen, prijs = ", prijs)
