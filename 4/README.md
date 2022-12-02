# Stub & Mock

<b>Stub</b> to obiekt, który zawiera przykładową implementację imitującą działanie tej właściwej.  
Przykłady uzycia to np. sytuacja gdy podczas testów nie mamy dostępu do prawdziwej metody zwracającej dane  
Obiekty stub sprawdzą się dobrze podczas testów prostych metod, jednak przy większym rozmiarze potrzebnych   
danych mogą one urosnąć do dużych rozmiarów co może okazać się cięzkie w utrzymaniu.
<br><br>
Natomiast <b>mock</b>  to obiekt symulujący działanie rzeczywistego obiektu. Pozwala określić jakich interakcji spodziewamy się w trakcie testów, a następnie zweryfikować, czy nastąpiły.<br>
W porównaniu do stubów, mocki mogą być tworzone dynamicznie w czasie działania kodu oraz zapewniają większą elastyczność. <br>Dają też znacznie więcej funkcjonalności, takich jak chociażby weryfikacja wywołań metod (czy zostały wywołane, ile razy, w jakiej kolejności, z jakimi parametrami itp.)

<br>
Przykład zastosowania stuba - AcademyAwardServiceStubTest - stworzona klasa stub <b>AcademyAwardRepositoryStub</b> rozszerzająca intrefejs <b>AcademyAwardRepository</b> i metoda <b>findAcademyAwardByAwarded</b> zwracająca konkretne 3 elementy imitująca w ten sposób działanie metody na prawdziwej bazie
<br>
Przykłady zastosowania mocków - klasy testowe <b>AcademyAwardServiceTest</b> oraz <b>FillUpDatabaseServiceTest</b> <br> -
mockowane są repozytoria, klasy domenowe, DTO oraz serwisy.