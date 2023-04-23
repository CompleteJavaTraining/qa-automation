## Steps to Install Java Development Kit (JDK)

1. Visit the official Oracle JDK download page: [https://www.oracle.com/java/technologies/javase-jdk14-downloads.html](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html)

2. Choose the appropriate JDK installer for your operating system (Windows, macOS, or Linux) and download it.

   - For **Windows**:
     1. Run the downloaded installer (`.exe` file).
     2. Follow the installation wizard and accept the default settings or customize them as needed.
     3. Once installed, set the `JAVA_HOME` environment variable:
        - Right-click on "This PC" or "Computer" and select "Properties".
        - Click on "Advanced system settings".
        - In the "System Properties" window, go to the "Advanced" tab and click on "Environment Variables".
        - In the "System variables" section, click on "New" and add a variable with the name `JAVA_HOME` and the value as the JDK installation path (e.g., `C:\Program Files\Java\jdk-14.0.2`).
        - Click "OK" to save the changes.

   - For **macOS**:
     1. Open the downloaded installer (`.dmg` file).
     2. Double-click on the `.pkg` file inside the disk image and follow the installation wizard.
     3. Once installed, open a terminal and run the following command to set the `JAVA_HOME` environment variable:
        ```
        echo 'export JAVA_HOME=$(/usr/libexec/java_home)' >> ~/.zshrc
        ```
        If you are using bash instead of zsh, replace `~/.zshrc` with `~/.bash_profile`.

   - For **Linux** (Debian or Ubuntu based distributions):
     1. Open a terminal and run the following command to install the JDK using the package manager:
        ```
        sudo apt install openjdk-14-jdk
        ```
     2. After installation, set the `JAVA_HOME` environment variable by editing the `/etc/environment` file:
        - Run the following command to open the file in a text editor:
          ```
          sudo nano /etc/environment
          ```
        - Add the following line at the end of the file:
          ```
          JAVA_HOME="/usr/lib/jvm/java-14-openjdk-amd64"
          ```
          Make sure to replace the path with the actual JDK installation path on your system.
        - Save the changes and close the editor.
        - Run the following command to reload the environment variables:
          ```
          source /etc/environment
          ```

3. Verify the JDK installation by opening a terminal or command prompt and running the following command:

