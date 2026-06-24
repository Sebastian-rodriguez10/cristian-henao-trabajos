1. lo que hace el singleton es hacer que las clases tengan una unica instancia y siemore utilizar la misma para no tener mas instancias que llen la memoria y retracen el proyecto, entonces centraliza una sola instancia para otras clases

2. Para que quede centralizado un una sola clase y tenga que crear multiples instancias para hacer lo mismo

3. Expone un método público (comúnmente llamado getInstanceg) que devuelve la instancia única. Si la instancia aún no ha sido creada, el método la crea y la almacena; si ya existe, simplemente la retorna

4. Es que cuando se crean multiples instancias cada instancias consume mas memoria y una instancia compartida es de que todos los componentes que allan en el sistema solo aceden a la misma instancia siempre y eso nos ayudaria a no gastar memoria de manera inecesaria 

5. Lo implemente con las anotaciones de service o de repository y de controller el mismo springboot le crea la instnacia unica a uno para que siempre se esta utilizando la misma instancia globalmente

6. que springboot lo hace solo colocando la anotacion y hacerlo a pedal con java es maluco entonces sprinboot nos facilita usar singleton

7. Cuando una clase solo nececita usarla para lo mismo entonces seria inncecesario crear multiples instancias para hacer lo mismo entonces por eso aparece singleton para tener siempre una sola instancia globalmente para no consumir memoria 