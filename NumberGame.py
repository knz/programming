import random

# ---- CONSTANTEN ----
MAX_GETAL = 100

# ---- "hulp" functie(s) ----
def leesGetal():
    x = None
    while x is None:
        i = input()
        if isinstance(i, int):
            x = i
        else:
            print "Niet een getal, probeer nogmaal..."
    return x

# ---- programma start hier -------

gekozenGetal = random.randint(1, MAX_GETAL)
aantalPogingen = 0
gok = None

# Python heeft geen do...while loop, we doen het dus net anders
while aantalPogingen <= 100 and gok != gekozenGetal:
    aantalPogingen = aantalPogingen + 1

    print "Doe een gok? "
    gok = leesGetal()

    if gok > gekozenGetal:
        print "te groot!"
    if gok < gekozenGetal:
        print "te klein!"
    if gok == gekozenGetal:
        print "goed gegokt!"

score = MAX_GETAL + 1 - aantalPogingen
print "Score is ", score
