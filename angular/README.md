## Angular
#### Exercícios de Angular do curso de Desenvolvimento Web Full Stack do Bootcamp Santander da DIO.

Será utilizado o Angular no projeto na versão 14.1.2:
```
npm install -g @angular/cli@14.1.2
```
Obs: Não foi possível utilizar os comandos `ng` sem instalar o Angular CLI globalmente.

Extensões utilizadas no VSCode:
- Angular Language Service
- Auto Close Tag
- Auto Rename Tag

Muito simples utilizar o `ng` para manipular o projeto Angular.

Ciclo de Vida de Componentes no Angular:
- ngOnChanges: Quando o valor de um atributo de entrada é atualizado.
- ngOnInit: Quando o componente é inicializado.
- ngDoCheck: A cada ciclo de verificação de mudanças.
- ngAfterContentInit: Depois de inserir conteúdo externo na visualização.
- ngAfterContentChecked: A cada verificação de conteúdo inserido.
- ngAfterViewInit: Depois que a visualização do componente é inicializada.
- ngAfterViewChecked: A cada verificação de visualização.
- ngOnDestroy: Antes da instância do componente ser destruída.
