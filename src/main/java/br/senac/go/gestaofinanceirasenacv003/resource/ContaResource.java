package br.senac.go.gestaofinanceirasenacv003.resource;

import br.senac.go.gestaofinanceirasenacv003.interfaces.IResource;
import br.senac.go.gestaofinanceirasenacv003.model.Conta;
import br.senac.go.gestaofinanceirasenacv003.service.ContaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = "/api/conta")
@Tag(name = "Conta", description = "Documentação sobre resource 'Conta'")

public class ContaResource implements IResource<Conta,Integer> {

    @Autowired
    ContaService contaService;

    @Override
    @Operation(
            summary = "Criar 'Conta'",
            description = "Método responsável para criar uma conta no sistema.",
            tags = {"Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Conta create(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.create");
        log.debug(String.format("Executado método ContaResource.create | valores: %s",entity.toString()));

        return contaService.create(entity);
    }

    @Override
    @Operation(
            summary = "Recuperar 'Conta'",
            description = "Método responsável por recuperar conta no sistema.",
            tags = {"Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Conta read(@Valid @RequestBody Conta entity) throws Exception {
        log.info("Executado método ContaResource.read");
        log.debug(String.format("Executado método ContaResource.read | valores: %s",entity.toString()));

        return contaService.read(entity);
    }

    @Override
    @Operation(
            summary = "Recuperar 'Conta' por ID",
            description = "Método responsável por recuperar conta no sistema por ID.",
            tags = {"Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Conta readById(@PathVariable Integer id) throws Exception {
        log.info("Executado método ContaResource.readById");
        log.debug(String.format("Executado método ContaResource.readById | valores: %d",id));

        return contaService.readById(id);
    }

    @Override
    @Operation(
            summary = "Atualizar 'Conta'",
            description = "Método responsável por atualizar uma conta no sistema.",
            tags = {"Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PutMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Conta update(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.update");
        log.debug(String.format("Executado método ContaResource.update | valores: %s",entity.toString()));

        return contaService.update(entity);
    }

    @Override
    @Operation(
            summary = "Atualizar uma parte 'Conta'",
            description = "Método responsável para atualizar parte de uma conta.",
            tags = {"Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PatchMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Conta updatePart(@PathVariable Integer id, @Valid @RequestBody Conta entity) throws Exception {
        log.info("Executado método ContaResource.updatePart");
        log.debug(String.format("Executado método ContaResource.updatePart | valores: %d, %s",id, entity.toString()));

        return contaService.updatePart(id, entity);
    }

    @Override
    @Operation(
            summary = "Atualizar 'Conta' completo",
            description = "Método responsável para atualizar por completo uma conta no sistema.",
            tags = {"Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PutMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Conta updateFull(@PathVariable Integer id, @Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.updateFull");
        log.debug(String.format("Executado método ContaResource.updateFull | valores: %d, %s",id, entity.toString()));

        return contaService.updateFull(id, entity);
    }

    @Override
    @Operation(
            summary = "Deletar 'Conta' por ID.",
            description = "Método responsável para deletar uma conta por ID.",
            tags = {"Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado método ContaResource.delete");
        log.debug(String.format("Executado método ContaResource.delete | valores: %d",id));

        contaService.deleteById(id);
    }

    @Override
    @Operation(
            summary = "Deletar 'Conta' com base no objeto informado",
            description = "Método responsável para deletar uma conta com base no objeto informado.",
            tags = {"Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public void deleteByEntity(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.deleteByEntity");
        log.debug(String.format("Executado método ContaResource.deleteByEntity | valores: %s",entity.toString()));

        contaService.delete(entity);
    }
}
