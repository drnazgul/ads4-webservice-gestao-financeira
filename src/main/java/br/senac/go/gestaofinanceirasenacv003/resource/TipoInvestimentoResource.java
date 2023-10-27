package br.senac.go.gestaofinanceirasenacv003.resource;

import br.senac.go.gestaofinanceirasenacv003.interfaces.IResource;
import br.senac.go.gestaofinanceirasenacv003.model.TipoInvestimento;
import br.senac.go.gestaofinanceirasenacv003.service.TipoInvestimentoService;
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
@RequestMapping("api/tipo-investimento")
@Tag(name = "Tipo Investimento", description = "Documentação ao resource 'Tipo Investimento'")

public class TipoInvestimentoResource implements IResource<TipoInvestimento, Integer> {

    @Autowired
    TipoInvestimentoService tipoInvestimentoService;

    @Override
    @Operation(
            summary = "Criar 'Tipo Investimento'",
            description = "Método responsável por criar um tipo investimento no sistema.",
            tags = {"Tipo Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) })})
    @PostMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoInvestimento create(@Valid @RequestBody TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoResource.create");
        log.debug(String.format("Executado método TipoInvestimentoResource.create | valores: %s", entity.toString()));

        return tipoInvestimentoService.create(entity);
    }

    @Override
    @Operation(
            summary = "Recuperar 'Tipo Investimento'",
            description = "Método responsável por recuperar tipo investimento no sistema.",
            tags = {"Tipo Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoInvestimento read(@Valid @RequestBody TipoInvestimento entity) throws Exception {
        log.info("Executado método TipoInvestimentoResource.read");
        log.debug(String.format("Executado método TipoInvestimentoResource.read | valores: %s", entity.toString()));

        return tipoInvestimentoService.read(entity);
    }

    @Override
    @Operation(
            summary = "Recuperar 'Tipo Investimento' por ID",
            description = "Método responsável por recuperar um tipo investimento no sistema por ID.",
            tags = {"Tipo Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping(value = "/{id}",
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoInvestimento readById(@PathVariable Integer id) throws Exception {
        log.info("Executado método TipoInvestimentoResource.readById");
        log.debug(String.format("Executado método TipoInvestimentoResource.readById | valores: %d", id ));

        return tipoInvestimentoService.readById(id);
    }

    @Override
    @Operation(
            summary = "Atualizar 'Tipo Investimento'",
            description = "Método responsável por atualizar um tipo investimento no sistema.",
            tags = {"Tipo Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PutMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoInvestimento update(@Valid @RequestBody TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoResource.update");
        log.debug(String.format("Executado método TipoInvestimentoResource.update | valores: %s", entity.toString()));

        return tipoInvestimentoService.update(entity);
    }

    @Override
    @Operation(
            summary = "Atualizar uma parte 'Tipo Investimento'",
            description = "Método responsável por atualizar uma parte do tipo investimento no sistema.",
            tags = {"Tipo Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PatchMapping(value ="/{id}",
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoInvestimento updatePart(@PathVariable Integer id, @Valid @RequestBody TipoInvestimento entity) throws Exception {
        log.info("Executado método TipoInvestimentoResource.update");
        log.debug(String.format("Executado método TipoInvestimentoResource.update | valores: %d %s", id, entity.toString()));

        return tipoInvestimentoService.updatePart(id, entity);
    }

    @Override
    @Operation(
            summary = "Atualizar 'Tipo Investimento' completo",
            description = "Método responsável por atualizar por completo um tipo investimento no sistema.",
            tags = {"Tipo Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PutMapping(value ="/{id}",
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public TipoInvestimento updateFull(@PathVariable Integer id, @Valid @RequestBody TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoResource.update");
        log.debug(String.format("Executado método TipoInvestimentoResource.update | valores: %d, %s", id, entity.toString()));

        return tipoInvestimentoService.updateFull(id, entity);
    }

    @Override
    @Operation(
            summary = "Deletar 'Tipo Investimento' por ID",
            description = "Método responsável por deletar um tipo investimento por ID.",
            tags = {"Tipo Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "204", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado método TipoInvestimentoResource.delete");
        log.debug(String.format("Executado método TipoInvestimentoResource.delete | valores: %d", id));

        tipoInvestimentoService.deleteById(id);
    }

    @Override
    @Operation(
            summary = "Deletar 'Tipo Investimento' com base no objeto informado",
            description = "Método responsável por deletar um tipo investimento com base no objeto informado.",
            tags = {"Tipo Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "204", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @DeleteMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public void deleteByEntity(@Valid @RequestBody TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoResource.delete");
        log.debug(String.format("Executado método TipoInvestimentoResource.delete | valores: %s", entity.toString()));

        tipoInvestimentoService.delete(entity);
    }
}
