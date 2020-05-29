### Dijkstra algorithm

#### What is what

1. Nodes:
    * Dit is een class waar nodes gemaakt worden en waar je ndoes met elkaar kan verbinden.
    De list ShortestPath is een lijst waar het dijkstra algoritme steeds nieuwe waardes in stopt.
    * De nodes krijgen een bepaalde Type met behulp van de classes Rit,Vlucht en Treinrit. Dit type
    wordt opgeslagen en later gebruikt.
    
2. Rit/Vluch/Treinrit:
    * Deze 3 zijn eigenlijk hetzelfde. Het zijn 3 classes die gebruik maken van een abstract class Stap.
    De reden waarom we ze nog wel gebruiken is zodat ik de Node een bepaald type kan geven die later wordt gebruikt
    
3. Stap:
    * Zoals net gezegd is dit een abstract class. Er staan hier maar 2 functies in die me helpen met het verbinden van
    nodes aan een node. Zo kan ik bijvoorbeeld zeggen dat node a verbonden is met node b. Dit is een reis die van het
    type Rit kan zijn, maar ook voor bijvoorbeeld het type Vlucht.

4. Graph:
    * Dit is een class die het dijkstra algoritme implementeert. Het maakt gebruik van de nodes die van te voren zijn
    gemaakt en berekent dus de kortste route. De code in deze class is van een website en de link wordt in de bronnen
    vermeld en ik de graph class zelf

5. Reis:
    * Dit is een class die alles mooi uitprint en toont in de console. Het maakt gebruik van de types van de nodes
    om te bepalen wat er precies geprint moet worden.
    
### Bronnen

* Dijkstra algoritme: https://www.baeldung.com/java-dijkstra