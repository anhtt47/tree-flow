[![Published on Vaadin  Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/tree)
[![Stars on Vaadin Directory](https://img.shields.io/vaadin-directory/star/tree.svg)](https://vaadin.com/directory/component/tree)

# Tree

Vaadin 21 Java version of Tree component

## Release notes

### Version 2.3.1

- Add setSanitize method to disable html sanitation

### Version 2.3.0

- Tested with Vaadin 23
- Control icon size by --lumo-icon-size-m custom property
- Added htmlProvider
- Fixed removeClassName
- Added addThemeVariants / removeThemeVariants
- Toggle expand/collapse only with button

### Version 2.2.2

- Fixed styling

### Version 2.2.1

- Fixed regression due previous change, Images stopped working

### Version 2.2.0

- Fix broken VaadinIcon support due change in Vaadin 21

### Version 2.1.0

- Support Images as icons

### Version 2.0.0

- Initial version


## Development instructions

Starting the test/demo server:
1. Run `mvn jetty:run`.
2. Open http://localhost:8080 in the browser.

## Publishing to Vaadin Directory

You can create the zip package needed for [Vaadin Directory](https://vaadin.com/directory/) using
```
mvn versions:set -DnewVersion=1.0.0 # You cannot publish snapshot versions 
mvn install -Pdirectory
```

The package is created as `target/tree-flow-1.0.0.zip`

For more information or to upload the package, visit https://vaadin.com/directory/my-components?uploadNewComponent
