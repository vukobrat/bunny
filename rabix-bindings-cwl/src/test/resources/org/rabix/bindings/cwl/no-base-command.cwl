{
    "cwlVersion": "v1.0",
    "class": "CommandLineTool",
    "requirements": {
      "DockerRequirement": {
        "dockerPull": "ubuntu:latest"
      },
      "InitialWorkDirRequirement": {
        "listing": [
          "$(inputs.src)"
        ]
      }
    },
    "inputs": [
      { "id": "message",
        "type": "string",
        "inputBinding": {
          "position": 1
        }
      },
      {
        "id": "src",
        "type": "File"
      },
      { "id": "dir",
      	"type" : "Directory"
      }
    ],
    "outputs": []
  }
