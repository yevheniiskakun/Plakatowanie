# Plakatowanie
Zadanie z olimpiady informatycznej. Program dla rozwiązania probłemu plakatowania budynków

Wszystkie budynki we wschodniej czesci Bajtogrodu zostały zbudowane zgodnie z zasadami
starego bajtobudownictwa: stoja one jeden przy drugim (nie ma miedzy nimi przerw). Razem
tworza bardzo długa sciane budynków o zróznicowanej wysokosci, ciagnaca sie ze wschodu na
zachód.
Burmistrz Bajtogrodu, Bajtazar, postanowił, ze sciane budynków nalezy od północnej
strony pokryc plakatami. Bajtazar zastanawia sie, jaka minimalna liczba plakatów mozna
pokryc cała północna sciane budynków. Plakaty powinny miec kształt prostokatów o bokach
pionowych i poziomych. Plakaty nie moga zachodzic na siebie, natomiast moga stykac
sie brzegami. Kazdy plakat musi w całosci przylegac do scian pewnych budynków i cała
powierzchnia północnych scian budynków musi byc pokryta plakatami.
Zadanie:
• wczytać ze standardowego wejscia opisy budynków,
• wyznaczyć minimalna liczbe plakatów potrzebnych do całkowitego pokrycia ich północnych
scian,
• wypisać wynik na standardowe wyjscie.
Wejscie
Pierwszy wiersz wejscia zawiera jedna liczbe całkowita n (1 < n < 250 000 ), oznaczajaca
liczbe budynków stojacych w rzedzie. Kolejne n wierszy zawiera po dwie liczby całkowite di
i wi (1 < di,wi < 1 000 000 000 ), oddzielone pojedynczym odstepem i oznaczajace długosc
i wysokosc i-tego budynku w rzedzie.
5
1 2
1 3
2 2
2 5
1 4