public class Main {
  
  public static void main(String[] args) {
    
    Dicionario d = new Dicionario();
    
    povoarDicionario(d);
    
    d.ordenar();
    
    System.out.println(d);
  }
  
  public static void povoarDicionario(Dicionario d) {
    d.adicionaTermo("PT", "Hipopotamo", "O hipopótamo-comum ou hipopótamo-do-nilo é um mamífero herbívoro de grande porte da África subsariana e uma das duas únicas espécies não extintas da família Hippopotamidae, sendo a outra o hipopótamo-pigmeu.");
    d.adicionaTermo("EN", "Cat", "The cat (Felis catus) is a small carnivorous mammal. It is the only domesticated species in the ... As of 2017, the domestic cat was the second-most popular pet in the U.S. by number of pets owned, after freshwater fish.");
    d.adicionaTermo("PT", "Abelha", "Abelha é a denominação comum de vários insetos pertencentes à ordem Hymenoptera, da superfamília Apoidea, subgrupo Anthophila, aparentados das vespas e formigas");
    d.adicionaTermo("PT", "Cachorro", "animal de quatro patas, melhor amigo do homem");
    d.adicionaTermo("PT", "Baleia", "Comum às várias spp. de grandes mamíferos cetáceos, marinhos, principalmente as das fam. dos balenídeos e dos balenopterídeos");
    d.adicionaTermo("PT", "Dromedario", "animal mamífero nativo da região nordeste da África e da parte ocidental da Ásia, pertencente à família Camelidae, sendo um parente próximo dos camelos");
    d.adicionaTermo("PT","Foca", "As focas são mamíferos da família dos focídeos, super-família dos pinípedes, adaptadas à vida marinha. ");
    d.adicionaTermo("EN", "Bee", "Bees are flying insects closely related to wasps and ants, known for their role in pollination");
    d.adicionaTermo("PT", "Elefante", "Elefante é o termo genérico e popular pelo qual são denominados os membros da família Elephantidae, um grupo de mamíferos proboscídeos elefantídeos");
    d.adicionaTermo("PT", "Gato", "O gato, também conhecido como gato caseiro, gato urbano ou gato doméstico, é um mamífero carnívoro da família dos felídeos, muito popular como animal de estimação");
    d.adicionaTermo("EN", "Dog", "The domestic dog is a member of the genus Canis (canines), which forms part of the wolf-like canids, and is the most widely abundant terrestrial carnivore.");
    
  }
}