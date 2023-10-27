package br.senac.go.gestaofinanceirasenacv003.resource;

import br.senac.go.gestaofinanceirasenacv003.interfaces.IResource;
import br.senac.go.gestaofinanceirasenacv003.model.Investimento;
import br.senac.go.gestaofinanceirasenacv003.service.InvestimentoService;
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
@RequestMapping("api/investimento")
@Tag(name = "Investimento", description = "Documentação sobre resource 'Investimento'")

public class InvestimentoResource implements IResource<Investimento, Integer> {

    @Autowired
    InvestimentoService investimentoService;

    @Override
    @Operation(
            summary = "Criar 'Investimento'",
            description = "Método responsável por criar um investimento no sistema.",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) })})
    @PostMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public Investimento create(@Valid @RequestBody Investimento entity) {
        log.info("Executado método InvestimentoResource.create");
        log.debug(String.format("Executado método InvestimentoResource.create | valores: %s", entity.toString()));

        return investimentoService.create(entity);
    }

    @Override
    @Operation(
            summary = "Recuperar 'Investimento'",
            description = "Método responsável por recuperar investimento no sistema.",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public Investimento read(@Valid @RequestBody Investimento entity) throws Exception {
        log.info("Executado método InvestimentoResource.read");
        log.debug(String.format("Executado método InvestimentoResource.read | valores: %s", entity.toString()));

        return investimentoService.read(entity);
    }

    @Override
    @Operation(
            summary = "Recuperar 'Investimento' por ID",
            description = "Método responsável por recuperar um investimento no sistema por ID.",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping(value = "/{id}",
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public Investimento readById(@PathVariable Integer id) throws Exception {
        log.info("Executado método InvestimentoResource.readById");
        log.debug(String.format("Executado método InvestimentoResource.readById | valores: %d", id));

        return investimentoService.readById(id);
    }

    @Override
    @Operation(
            summary = "Atualizar 'Investimento'",
            description = "Método responsável por atualizar um investimento no sistema.",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PutMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public Investimento update(@Valid @RequestBody Investimento entity) {
        log.info("Executado método InvestimentoResource.update");
        log.debug(String.format("Executado método InvestimentoResource.update | valores: %s",entity.toString()));

        return investimentoService.update(entity);
    }

    @Override
    @Operation(
            summary = "Atualizar uma parte 'Investimento'",
            description = "Método responsável por atualizar parte do investimento no sistema.",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PatchMapping(value ="/{id}",
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public Investimento updatePart(@PathVariable Integer id, @Valid @RequestBody Investimento entity) throws Exception {
        log.info("Executado método InvestimentoResource.updatePart");
        log.debug(String.format("Executado método InvestimentoResource.updatePart | valores: %d, %s",id ,entity.toString()));

        return investimentoService.updatePart(id, entity);
    }

    @Override
    @Operation(
            summary = "Atualizar 'Investimento' completo",
            description = "Método responsável por atualizar por completo um investimento no sistema.",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @PutMapping(value = "/{id}",
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public Investimento updateFull(@PathVariable Integer id, @Valid @RequestBody Investimento entity) {
        log.info("Executado método InvestimentoResource.update");
        log.debug(String.format("Executado método InvestimentoResource.update | valores: %d, %s", id, entity.toString()));

        return investimentoService.updateFull(id, entity);
    }

    @Override
    @Operation(
            summary = "Deletar 'Investimento' por ID",
            description = "Método responsável por deletar um investimento por ID.",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("Executado método InvestimentoResource.delete");
        log.debug(String.format("Executado método InvestimentoResource.delete | valores: %d", id));

        investimentoService.deleteById(id);
    }

    @Override
    @Operation(
            summary = "Deletar uma 'Investimento'",
            description = "Método responsável para Deletar uma investimento no sistema",
            tags = {"Investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Investimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public void deleteByEntity(@Valid @RequestBody Investimento entity) {
        log.info("Executado método InvestimentoResource.delete");
        log.debug(String.format("Executado método InvestimentoResource.delete | valores: %s", entity.toString()));

        investimentoService.delete(entity);
    }

}
