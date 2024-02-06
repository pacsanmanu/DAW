function descomponerURL(url) {
    const urlObj = new URL(url);
    
    const protocol = urlObj.protocol.split(":")[0];
    const ipAdress = urlObj.hostname;
    const subDomain = urlObj.hostname.split('.').slice(0, -2).join('.');
    const domainName = urlObj.hostname.replace(subDomain + '.', '');
    const folderTree = urlObj.pathname;
    const targetFile = urlObj.pathname.split('/').pop();
    let argumentsFile = urlObj.search;
    argumentsFile = argumentsFile.replace("?", "");
    argumentsFile = argumentsFile.split("&");
    const arguments = {};
    argumentsFile.forEach(element => {
        const elements = element.split("=");
        const key = elements[0];
        const value = elements[1];
        arguments[key] = value;
    });
    
    return {
      protocol,
      ipAdress,
      subDomain,
      domainName,
      folderTree,
      targetFile,
      arguments,
    };
  }
  
  const url = "https://www.ejemplo.com/carpeta/archivo.html?arg1=test1&arg2=test2";
  const components = descomponerURL(url);
  
  console.log("Protocolo:", components.protocol);
  console.log("Dirección IP:", components.ipAdress);
  console.log("Subdominio:", components.subDomain);
  console.log("Nombre de dominio:", components.domainName);
  console.log("Árbol de carpetas:", components.folderTree);
  console.log("Archivo de destino:", components.targetFile);
  console.log("Argumentos del archivo:", components.arguments);
  