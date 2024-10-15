package attest.homework017.controller;

import attest.homework017.model.TV;
import attest.homework017.service.TVService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tv")
@Tag(name = "TV")
public class TVController {

    private final TVService tvService;

    @Autowired
    public TVController(TVService tvService) {
        this.tvService = tvService;
    }

    @PostMapping
    @Operation(summary = "Создание new TV")
    public ResponseEntity<TV> createTV(@RequestBody TV tv) {
        TV createdTV = tvService.createTV(tv);
        return new ResponseEntity<>(createdTV, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Обновление info TV")
    public ResponseEntity<TV> updateTV(@PathVariable Long id, @RequestBody TV tv) {
        tv.setId(id);
        TV updatedTV = tvService.updateTV(tv);
        return ResponseEntity.ok(updatedTV);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Удаление TV")
    public ResponseEntity<Void> deleteTV(@PathVariable Long id) {
        tvService.deleteTV(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Получение info TV по ID")

    public ResponseEntity<TV> getTVById(@PathVariable Long id) {
        TV tv = tvService.getTVById(id);
        return ResponseEntity.ok(tv);
    }

    @GetMapping
    @Operation(summary = "Получеине списка всех TV")
    public ResponseEntity<List<TV>> getAllTVs() {
        List<TV> tvs = tvService.getAllTVs();
        return ResponseEntity.ok(tvs);
    }
}
