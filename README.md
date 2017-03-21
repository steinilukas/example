# Beispielprojekt

Das ist ein weiteres kleines Beispielprojekt analog zum Tutorium. Versuchen Sie die Klasse `Bug` (`src/main/java/Bug.java`) so auszubessern, dass die Tests in `BugTests` (`src/test/java/BugTests.java`) korrekt durchlaufen.

1. Erstellen Sie wieder einen persönlichen `fork` des Projekts auf https://inf-git.fh-rosenheim.de/

2. Klonen Sie das Projekt lokal, in dem Sie das Projekt in IntelliJ von Git importieren, oder "per Hand" in der Konsole:
    ```
    $ git clone htps://inf-git.fh-rosenheim.de/<sINFmamuster>/example.git
    ```

3. Erstellen Sie einen lokalen `branch` `loesung` (Name flexibel!), entweder in IntelliJ (Git Schaltfläche rechts unten -> "+ Create Branch") oder in der Konsole (Schaltfläche links unten: "Console"/"Konsole") mit
    ```
    $ git checkout -b loesung
    ```

4. Finden und beheben Sie den/die Fehler. Tests werden mit den kleinen grünen Playschaltern links neben dem Editorfeld gestartet (oder mit Rechtsklick auf der Klasse).

5. Fügen Sie die geänderte Datei `Bug.java` dem Stagingbereich hinzu, im IntelliJ mit Rechtsklick -> Git -> Add, oder inder Konsole mit
    ```
    $ git add src/main/java/Bug.java
    ```

6. Committen und pushen Sie die Änderungen, entweder via VCS -> Commit Changes -> Commit and Push, oder in der Konsole mit
    ```
    $ git commit -m "Ihre Commit-Nachricht"
    $ git push -u origin loesung
    ```

7. Verifizieren Sie unter https://inf-git.fh-rosenheim.de in Ihrem Repository unter "Pipelines" oder "Activity", dass der Testcase auch auf dem Server durchläuft.

8. Erstellen Sie einen _merge request_ von Ihrem branch `loesung` zu https://inf-git.fh-rosenheim.de/wif-prg2/example (dem originalem Repository).

Glückwunsch, schon wieder ein Beispiel geschafft!

# Zusatzaufgabe
Erstellen Sie nun ein eigenes Repository ("Project"), fügen Sie eine Datei hinzu, und lassen Sie eine/n Freund/in dieses forken, einen branch erstellen, eine Änderung vornehmen, und einen merge request zu Ihnen erstellen.

