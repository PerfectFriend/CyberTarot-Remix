# 🔮 CyberTarot — Экспорт и установка APK

## 1. Штатный экспорт через меню Google AI Studio
1. В правом верхнем углу интерфейса Google AI Studio нажмите на иконку настроек (⚙️) или меню экспорта (`...`).
2. Выберите **«Download APK»** (или «Export as ZIP»).
3. Платформа отдаст готовый файл из скомпилированного хранилища `.build-outputs/app-debug.apk`.

---

## 2. Локальная сборка на компьютере (Android Studio)
Если вы экспортировали проект как ZIP-архив:
1. Распакуйте архив и откройте папку проекта в **Android Studio**.
2. Дождитесь синхронизации Gradle и нажмите:
   **Build → Build Bundle(s) / APK(s) → Build APK(s)**
3. Либо выполните в терминале команду:
   ```bash
   ./gradlew assembleDebug
   ```
   Готовый файл будет находиться в `app/build/outputs/apk/debug/app-debug.apk`.

---

## 3. Файлы APK в проекте:
- **`CyberTarot.apk`** — в корне проекта
- **`apk/CyberTarot.apk`** — в папке apk
- **`.build-outputs/app-debug.apk`** — в хранилище сборки
