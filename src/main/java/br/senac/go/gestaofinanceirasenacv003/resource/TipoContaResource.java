package br.senac.go.gestaofinanceirasenacv003.resource;

import br.senac.go.gestaofinanceirasenacv003.interfaces.IResource;
import br.senac.go.gestaofinanceirasenacv003.model.TipoConta;
import br.senac.go.gestaofinanceirasenacv003.service.TipoContaService;
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
@RequestMapping(value = "api/tipo-conta")
@Tag(name = "Tipo Conta", description = "Documentação sobre resource 'Tipo Conta'")

public class TipoContaResource implements IResource<TipoConta, Integer> {

    @Autowired
    TipoContaService tipoContaService;

    @Override
    @Operation(
            summary = "Criar 'Tipo Conta'",
            description = "Método responsável por criar um tipo de conta no sistema.",
            tags = {"Tipo Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) })})
    @PostMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoConta create(@Valid @RequestBody TipoConta entity) {
        log.info("Executado método TipoContaResource.create");
        log.debug(String.format("Executado método TipoContaResource.create | valores: %s", entity.toString()));

        return tipoContaService.create(entity);
    }

    @Override
    @Operation(
            summary = "Recuperar 'Tipo Conta'",
            description = "Método responsável por recuperar tipo de conta no sistema.",
            tags = {"Tipo Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoConta read(@Valid @RequestBody TipoConta entity) throws Exception {
        log.info("Executado método TipoContaResource.read");
        log.debug(String.format("Executado método TipoContaResource.read | valores: %s", entity.toString()));

        return tipoContaService.read(entity);
    }

    @Override
    @Operation(
            summary = "Recuperar 'Tipo Conta' por ID",
            description = "Método responsável por recuperar um tipo de conta no sistema por ID.",
            tags = {"Tipo Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping(value = "/{id}",
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoConta readById(@PathVariable Integer id) throws Exception {
        log.info("Executado método TipoContaResource.readById");
        log.debug(String.format("Executado método TipoContaResource.readById | valores: %d",id));

        return tipoContaService.readById(id);
    }

    @Override
    @Operation(
            summary = "Atualizar 'Tipo Conta'",
            description = "Método responsável por atualizar um tipo de conta no sistema.",
            tags = {"Tipo Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PutMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoConta update(@Valid @RequestBody TipoConta entity) {
        log.info("Executado método TipoContaResource.update");
        log.debug(String.format("Executado método TipoContaResource.update | valores: %s",entity.toString()));

        return tipoContaService.update(entity);
    }

    @Override
    @Operation(
            summary = "Atualizar uma parte 'Tipo Conta'",
            description = "Método responsável por atualizar uma parte do tipo de conta no sistema.",
            tags = {"Tipo Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PatchMapping(value ="/{id}",
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoConta updatePart(@PathVariable Integer id, @Valid @RequestBody TipoConta entity) throws Exception {
        log.info("Executado método TipoContaResource.update");
        log.debug(String.format("Executado método TipoContaResource.update | valores: %d, %s",id, entity.toString()));

        return tipoContaService.updatePart(id, entity);
    }

    @Override
    @Operation(
            summary = "Atualizar 'Tipo Conta' completo",
            description = "Método responsável por atualizar por completo um tipo de conta no sistema.",
            tags = {"Tipo Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PutMapping(value = "/{id}",
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoConta updateFull(@PathVariable Integer id,@Valid @RequestBody TipoConta entity) {
        log.info("Executado método TipoContaResource.update");
        log.debug(String.format("Executado método TipoContaResource.update | valores: %d, %s",id, entity.toString()));

        return tipoContaService.updateFull(id, entity);
    }

    @Override
    @Operation(
            summary = "Deletar 'Tipo Conta' por ID",
            description = "Método responsável por deletar um tipo de conta por ID.",
            tags = {"Tipo Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado método TipoContaResource.delete");
        log.debug(String.format("Executado método TipoContaResource.delete | valores: %d", id));

        tipoContaService.deleteById(id);
    }

    @Override
    @Operation(
            summary = "Deletar 'Tipo Conta' com base no objeto informado",
            description = "Método responsável por deletar um tipo de conta com base no objeto informado.",
            tags = {"Tipo Conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoConta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public void deleteByEntity(@Valid @RequestBody TipoConta entity) {
        log.info("Executado método TipoContaResource.delete");
        log.debug(String.format("Executado método TipoContaResource.delete | valores: %s", entity.toString()));

        tipoContaService.delete(entity);
    }
}
